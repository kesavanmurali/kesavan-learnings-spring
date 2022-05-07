package com.kesavan.petclinic.data.repositories;

import com.kesavan.petclinic.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
