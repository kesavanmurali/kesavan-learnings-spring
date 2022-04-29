package com.kesavan.spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    public Author(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /*
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
    */

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null  || (obj.getClass() != this.getClass())){
            return false;
        }

        Author obj2 = (Author) obj;

        return this.id != null ? this.id.equals(obj2.getId()) : obj2.getId()==null;

    }

    @Override
    public int hashCode() {
        return this.id != null ? this.id.hashCode() : 0;
    }
}
