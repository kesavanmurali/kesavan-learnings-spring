package com.kesavan.petclinic.data.services.springdatajpa;

import com.kesavan.petclinic.data.model.PetType;
import com.kesavan.petclinic.data.repositories.PetTypeRepository;
import com.kesavan.petclinic.data.services.PetTypeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    @Override
    public Set<PetType> findAll() {
        Set<PetType> types = new HashSet<>();
        this.petTypeRepository.findAll().forEach(types :: add);
        return types;
    }

    @Override
    public PetType findById(Long id) {
        return this.petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return this.petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        this.petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        this.petTypeRepository.deleteById(id);
    }
}
