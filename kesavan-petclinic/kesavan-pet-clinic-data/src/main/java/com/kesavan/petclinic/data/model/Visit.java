package com.kesavan.petclinic.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "description")
    private String desription;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
