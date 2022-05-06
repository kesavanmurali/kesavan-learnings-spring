package com.kesavan.petclinic.data.services.map;

import com.kesavan.petclinic.data.model.Owner;
import com.kesavan.petclinic.data.model.PetType;
import com.kesavan.petclinic.data.model.Pet;
import com.kesavan.petclinic.data.services.OwnerService;
import com.kesavan.petclinic.data.services.PetService;
import com.kesavan.petclinic.data.services.PetTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    @Override
    public Owner save(Owner owner) {

        if(owner == null){
            return null;
        }

        if(owner.getPets() != null){
            owner.getPets().forEach( pet -> {
                PetType petType = pet.getPetType();
                if(petType == null){
                    throw new RuntimeException("Pet Type is required");
                }
                if(petType.getId() == null){
                    PetType idSetPetType = petTypeService.save(petType);
                    pet.setPetType(idSetPetType);
                }

                if(pet.getId() == null){
                    Pet savedPet  = this.petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });
        }

        return super.save(owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }
}
