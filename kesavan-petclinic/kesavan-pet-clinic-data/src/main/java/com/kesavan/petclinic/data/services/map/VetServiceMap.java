package com.kesavan.petclinic.data.services.map;

import com.kesavan.petclinic.data.model.Speciality;
import com.kesavan.petclinic.data.model.Vet;
import com.kesavan.petclinic.data.services.SpecialityService;
import com.kesavan.petclinic.data.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    @Override
    public Vet save(Vet vet) {

        Set<Speciality> specialities = vet.getSpecialities();
        specialities.forEach( speciality -> {
            if(speciality.getId() == null){
                Speciality savedSpeciality = this.specialityService.save(speciality);
                speciality.setId(savedSpeciality.getId());
            }
        });

        return super.save(vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(vet -> vet.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }
}
