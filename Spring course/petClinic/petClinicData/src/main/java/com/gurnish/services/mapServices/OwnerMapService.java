package com.gurnish.services.mapServices;

import com.gurnish.model.Owner;
import com.gurnish.model.Pet;
import com.gurnish.services.OwnerServices;
import com.gurnish.services.PetService;
import com.gurnish.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerServices {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeMapService petTypeMapService, PetService petService) {
        this.petTypeService = petTypeMapService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object.getPets()!=null){
            object.getPets().forEach(pet -> {
                if(pet.getPetType()!=null){
                    if(pet.getPetType().getId()==null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }
                else
                    throw new RuntimeException("pet type is required");
                if(pet.getId()==null){
                    Pet savedPet=petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });
        }
        return super.save(object);
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
