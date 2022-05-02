package com.kesavan.petclinic.data.services.map;

import com.kesavan.petclinic.data.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public abstract class AbstractMapService<T extends BaseEntity, ID> {

    protected Map<ID, T> map = new HashMap<>();

    T findById(ID id){
        return map.get(id);
    }

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    protected T save(ID id, T object){
        map.put(id, object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
