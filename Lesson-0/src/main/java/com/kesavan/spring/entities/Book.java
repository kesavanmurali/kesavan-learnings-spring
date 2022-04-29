package com.kesavan.spring.entities;

import jakarta.persistence.*;

import java.util.Set;

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "author_books", joinColumns= @JoinColumn(name="book_id"),
                inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;
}
