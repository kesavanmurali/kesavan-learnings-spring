package com.kesavan.petclinic.data.services.map;

import com.kesavan.petclinic.data.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id){
        return map.get(id);
    }

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    protected T save(T object){

        if(object != null){
            if(object.getId()  == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else {
            throw new RuntimeException("Persisting a null Object");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException nsee){
            nextId = 1L;
        }

        return nextId;
    }

}
