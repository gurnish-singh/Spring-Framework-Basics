package com.gurnish.repositories;

import com.gurnish.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String string);

   // Optional<Owner> findById(Long aLong);
}
