package com.kesavan.spring.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}
