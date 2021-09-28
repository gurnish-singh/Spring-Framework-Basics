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
////without it we will not be able to launch this class

public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;

    public DataLoader(OwnerServices ownerServices, VetServices vetServices) {
        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerServices.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);

        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerServices.save(owner2);


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetServices.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
