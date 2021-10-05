package com.gurnish.services.mapServices;

import com.gurnish.model.Speciality;
import com.gurnish.model.Vet;
import com.gurnish.services.VetServices;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetServices {
    private final SpecialityMapService specialityMapService;

    public VetMapService(SpecialityMapService specialityMapService) {
        this.specialityMapService = specialityMapService;
    }

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
        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality= specialityMapService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save( object);
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
