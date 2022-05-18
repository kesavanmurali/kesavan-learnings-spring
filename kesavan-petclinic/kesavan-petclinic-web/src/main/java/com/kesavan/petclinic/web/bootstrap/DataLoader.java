package com.kesavan.petclinic.web.bootstrap;

import com.kesavan.petclinic.data.model.*;
import com.kesavan.petclinic.data.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    private final SpecialityService specialityService;

    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0) {
            loadStartupData();
        }
    }

    private void loadStartupData() {
        PetType dog = new PetType();
        dog.setName("Candy");
        PetType savedDogType = this.petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Catty");
        PetType savedCatType = this.petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("");
        Speciality savedRadiology = this.specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        Speciality savedSurgery = this.specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = this.specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Kesavan");
        owner1.setLastName("Murali");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet kesavansPet = new Pet();
        kesavansPet.setName("Dollee");
        kesavansPet.setOwner(owner1);
        kesavansPet.setBirthDate(LocalDate.now());
        kesavansPet.setPetType(savedDogType);
        owner1.getPets().add(kesavansPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rajendran");
        owner2.setLastName("Thiruvengatam");
        owner2.setAddress("123 Madurai");
        owner2.setCity("Tamil nadu");
        owner2.setTelephone("453345435");

        Pet rajsPet = new Pet();
        rajsPet.setName("Catee");
        rajsPet.setOwner(owner2);
        rajsPet.setBirthDate(LocalDate.now());
        rajsPet.setPetType(savedCatType);
        owner2.getPets().add(rajsPet);

        ownerService.save(owner2);

        Visit visit1 = new Visit();
        visit1.setPet(rajsPet);
        visit1.setDesription("Cough and cold");

        this.visitService.save(visit1);

        Vet vet1 = new Vet();
        vet1.setFirstName("Prabhavathi");
        vet1.setLastName("Murali");
        vet1.getSpecialities().add(savedRadiology);
        vet1.getSpecialities().add(savedDentistry);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Veteran");
        vet2.setLastName("Doooddooo");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);
    }
}
