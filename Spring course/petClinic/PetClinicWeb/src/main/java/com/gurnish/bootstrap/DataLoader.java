package com.gurnish.bootstrap;

import com.gurnish.model.*;
import com.gurnish.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component////it becomes a spring bean
///gets registered into the spring context
////without it we will not be able to launch this class

public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    public DataLoader(OwnerServices ownerServices, VetServices vetServices, PetService petService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }


    }

    private void loadData() {
        //              Pet Types here
        PetType dog = new PetType();
        dog.setName("billi");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("kutta");
        PetType savedCatType = petTypeService.save(cat);

//                  Speciality here
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("something");
        owner1.setTelephone("1234567890");
       // or we can do
//        owner1.builder().address("jbjb").telephone("mmnnknk").firstName("jnj").lastName("jbjbj").build();

        Pet gurnishPet = new Pet();
        gurnishPet.setPetType(savedDogType);
        gurnishPet.setBirthDate(LocalDate.now());
        gurnishPet.setName("juju");
        gurnishPet.setOwner(owner1);
        owner1.getPets().add(gurnishPet);

        ownerServices.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenane");
        owner2.setAddress("something");
        owner2.setTelephone("1234567890");

        Pet votiPet = new Pet();
        votiPet.setPetType(savedDogType);
        votiPet.setBirthDate(LocalDate.now());
        votiPet.setName("bubu");
        votiPet.setOwner(owner2);
        owner2.getPets().add(votiPet);

        ownerServices.save(owner2);


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedDentistry);
        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet1.getSpecialities().add(savedRadiology);
        vetServices.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
