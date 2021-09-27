package com.gurnish.bootstrap;

import com.gurnish.model.Owner;
import com.gurnish.model.Pet;
import com.gurnish.model.Vet;
import com.gurnish.services.OwnerServices;
import com.gurnish.services.VetServices;
import com.gurnish.services.mapServices.OwnerMapService;
import com.gurnish.services.mapServices.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component////it becomes a spring bean
///gets registered into the spring context
public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;

    public DataLoader() {
       ownerServices = new OwnerMapService();
        vetServices=new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        Pet mikesPet = new Pet();
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());

        ownerServices.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        Pet fionasCat = new Pet();
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());

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
