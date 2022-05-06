package com.kesavan.petclinic.data.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Visit extends BaseEntity{

    private String description;
    private LocalDate date;
    private Pet pet;

}
