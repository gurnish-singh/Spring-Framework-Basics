package petclinic.services;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices {
    Owner findByLastName(String Lastname);
    Owner findByID(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
