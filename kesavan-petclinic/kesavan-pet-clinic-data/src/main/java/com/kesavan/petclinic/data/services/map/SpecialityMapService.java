package com.kesavan.petclinic.data.services.map;

import com.kesavan.petclinic.data.model.Speciality;
import com.kesavan.petclinic.data.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {


    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality vet) {
        super.delete(vet);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
