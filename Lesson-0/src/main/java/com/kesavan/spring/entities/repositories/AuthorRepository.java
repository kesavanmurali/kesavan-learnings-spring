package com.kesavan.spring.entities.repositories;

import com.kesavan.spring.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
