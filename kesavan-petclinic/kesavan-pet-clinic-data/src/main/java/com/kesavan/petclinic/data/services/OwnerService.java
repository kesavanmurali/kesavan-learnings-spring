package com.kesavan.petclinic.data.services;

import com.kesavan.petclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
