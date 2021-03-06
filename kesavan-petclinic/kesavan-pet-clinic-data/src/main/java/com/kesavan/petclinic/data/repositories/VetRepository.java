package com.kesavan.petclinic.data.repositories;

import com.kesavan.petclinic.data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {

    Vet findByLastName(String lastName);
}
