package com.kesavan.spring.entities.repositories;

import com.kesavan.spring.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
