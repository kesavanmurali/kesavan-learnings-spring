package com.kesavan.petclinic.data.services.springdatajpa;

import com.kesavan.petclinic.data.model.Pet;
import com.kesavan.petclinic.data.repositories.PetRepository;
import com.kesavan.petclinic.data.services.PetService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        this.petRepository.findAll().forEach(pets :: add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return this.petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return this.petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        this.petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        this.petRepository.deleteById(id);
    }
}
