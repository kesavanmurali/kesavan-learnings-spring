package com.kesavan.petclinic.data.services.springdatajpa;

import com.kesavan.petclinic.data.model.Owner;
import com.kesavan.petclinic.data.model.Pet;
import com.kesavan.petclinic.data.repositories.OwnerRepository;
import com.kesavan.petclinic.data.repositories.PetRepository;
import com.kesavan.petclinic.data.repositories.PetTypeRepository;
import com.kesavan.petclinic.data.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();

        this.ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return this.ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return this.ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        this.ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        this.ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return this.ownerRepository.findByLastName(lastName);
    }
}
