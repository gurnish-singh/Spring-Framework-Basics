package petclinic.services;

import petclinic.model.Vet;

import java.util.Set;

public interface VetServices{
    Vet findByLastName(String Lastname);
    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
