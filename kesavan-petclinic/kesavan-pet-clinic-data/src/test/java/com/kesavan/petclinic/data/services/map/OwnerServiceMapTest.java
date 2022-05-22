package com.kesavan.petclinic.data.services.map;

import com.kesavan.petclinic.data.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    private static final Long ID = 1L;

    @BeforeEach
    void setUp() {
        this.ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        Owner owner = Owner.builder().build();
        owner.setId(ID);
        owner.setLastName("Kesavan");

        this.ownerServiceMap.save(owner);
    }

    @Test
    void save() {
        Owner owner = Owner.builder().build();
        owner.setId(2L);
        Owner savedOwner = this.ownerServiceMap.save(owner);
        assertEquals(2L, savedOwner.getId());
    }

    @Test
    void findAll() {
        Set<Owner> allOwners = ownerServiceMap.findAll();
        assertEquals(1, allOwners.size());
    }

    @Test
    void deleteById() {
        this.ownerServiceMap.deleteById(ID);
        assertEquals(0, this.ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        this.ownerServiceMap.delete(ownerServiceMap.findById(ID));
        assertEquals(0, this.ownerServiceMap.findAll().size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ID);
        assertEquals(ID, owner.getId());
    }

    @Test
    void findByLastName() {
        Owner foundOwner = ownerServiceMap.findByLastName("Kesavan");
        assertEquals(ID, foundOwner.getId());
    }
}