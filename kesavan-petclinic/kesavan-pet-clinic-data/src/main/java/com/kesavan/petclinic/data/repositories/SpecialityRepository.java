package com.kesavan.petclinic.data.repositories;

import com.kesavan.petclinic.data.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
