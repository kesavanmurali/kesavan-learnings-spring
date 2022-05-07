package com.kesavan.petclinic.data.services.springdatajpa;

import com.kesavan.petclinic.data.model.Vet;
import com.kesavan.petclinic.data.repositories.VetRepository;
import com.kesavan.petclinic.data.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Service
@Profile("springdatajpa")
public class VetsSDJpaService implements VetService {

    private final VetRepository vetRepository;

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        this.vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return this.vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return this.vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        this.vetRepository.delete(vet);

    }

    @Override
    public void deleteById(Long id) {
        this.vetRepository.deleteById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return this.vetRepository.findByLastName(lastName);
    }
}
