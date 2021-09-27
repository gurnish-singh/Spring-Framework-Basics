package com.gurnish.services.mapServices;

import com.gurnish.model.Owner;
import com.gurnish.services.OwnerServices;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerServices {
    @Override
    public Set<Owner> findAll() {
        return this.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save( Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object);

    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public Owner findByLastName(String Lastname) {
        return null;////isko baad mein dekhenge

    }
}
