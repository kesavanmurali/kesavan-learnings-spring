package com.kesavan.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@Getter
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String location;

    public Publisher(String name, String location){
        this.name = name;
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(obj == null  || (obj.getClass() != this.getClass())){
            return false;
        }

        Publisher obj2 = (Publisher) obj;

        return this.id != null ? this.id.equals(obj2.getId()) : obj2.getId()==null;

    }

    @Override
    public int hashCode() {
        return this.id != null ? this.id.hashCode() : 0;
    }
}