package com.kesavan.petclinic.data.services;

import com.kesavan.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
