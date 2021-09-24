package petclinic.services;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices extends  CrudService<Owner,Long> {
    Owner findByLastName(String Lastname);
}
