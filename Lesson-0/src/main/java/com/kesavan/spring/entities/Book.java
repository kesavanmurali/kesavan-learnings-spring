package com.kesavan.spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    public Book(String name) {
        this.name = name;
    }



    /*
    @ManyToMany
    @JoinTable(name = "author_books", joinColumns= @JoinColumn(name="book_id"),
                inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;
    */

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null  || (obj.getClass() != this.getClass())){
            return false;
        }

        Book obj2 = (Book) obj;

        return this.id != null ? this.id.equals(obj2.getId()) : obj2.getId()==null;

    }

    @Override
    public int hashCode() {
        return this.id != null ? this.id.hashCode() : 0;
    }
}
