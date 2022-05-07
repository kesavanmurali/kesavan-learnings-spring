package com.kesavan.petclinic.data.repositories;

import com.kesavan.petclinic.data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
