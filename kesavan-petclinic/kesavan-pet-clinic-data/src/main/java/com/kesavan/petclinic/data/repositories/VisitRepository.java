package com.kesavan.petclinic.data.repositories;

import com.kesavan.petclinic.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
