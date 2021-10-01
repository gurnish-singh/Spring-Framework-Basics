package com.gurnish.bootstrap;

import com.gurnish.model.Owner;
import com.gurnish.model.Pet;
import com.gurnish.model.PetType;
import com.gurnish.model.Vet;
import com.gurnish.services.OwnerServices;
import com.gurnish.services.PetService;
import com.gurnish.services.PetTypeService;
import com.gurnish.services.VetServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component////it becomes a spring bean
///gets registered into the spring context
////without it we will not be able to launch this class

public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;
    private final PetService petService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerServices ownerServices, VetServices vetServices, PetService petService, PetTypeService petTypeService) {
        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog=new PetType();
        dog.setName("billi");
        PetType savedDogType= petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("kutta");
        PetType savedCatType= petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("something");
        owner1.setTelephone("1234567890");
        ownerServices.save(owner1);
        Pet gurnishPet= new Pet();
        gurnishPet.setPetType(savedDogType);
        gurnishPet.setBirthDate(LocalDate.now());
        gurnishPet.setName("juju");
        gurnishPet.setOwner(owner1);
        owner1.getPets().add(gurnishPet);





        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("something");
        owner2.setTelephone("1234567890");
        ownerServices.save(owner2);
        Pet votiPet= new Pet();
        votiPet.setPetType(savedDogType);
        votiPet.setBirthDate(LocalDate.now());
        votiPet.setName("bubu");
        votiPet.setOwner(owner2);
        owner2.getPets().add(votiPet);


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetServices.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
