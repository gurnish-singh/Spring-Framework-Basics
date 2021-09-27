package com.gurnish.services.mapServices;

import com.gurnish.model.Vet;
import com.gurnish.services.VetServices;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetServices {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
