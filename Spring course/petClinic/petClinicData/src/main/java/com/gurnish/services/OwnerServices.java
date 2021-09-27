package com.gurnish.services;

import com.gurnish.model.Owner;

public interface OwnerServices extends  CrudService<Owner,Long> {
    Owner findByLastName(String Lastname);
}
