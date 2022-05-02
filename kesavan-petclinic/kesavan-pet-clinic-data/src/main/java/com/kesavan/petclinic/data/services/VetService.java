package com.kesavan.petclinic.data.services;

import com.kesavan.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService  extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
