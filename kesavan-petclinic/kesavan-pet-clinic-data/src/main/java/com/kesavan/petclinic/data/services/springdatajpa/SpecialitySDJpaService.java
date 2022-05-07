package com.kesavan.petclinic.data.services.springdatajpa;

import com.kesavan.petclinic.data.model.Speciality;
import com.kesavan.petclinic.data.model.Vet;
import com.kesavan.petclinic.data.repositories.SpecialityRepository;
import com.kesavan.petclinic.data.services.SpecialityService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
@AllArgsConstructor
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        this.specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return this.specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return this.specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        this.specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        this.specialityRepository.deleteById(id);
    }
}
