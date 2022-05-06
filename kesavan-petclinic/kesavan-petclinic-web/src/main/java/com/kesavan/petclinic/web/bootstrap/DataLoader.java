package com.kesavan.petclinic.web.bootstrap;

import com.kesavan.petclinic.data.model.Owner;
import com.kesavan.petclinic.data.model.PetType;
import com.kesavan.petclinic.data.model.Vet;
import com.kesavan.petclinic.data.services.OwnerService;
import com.kesavan.petclinic.data.services.PetTypeService;
import com.kesavan.petclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Candy");
        PetType savedDogType = this.petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Catty");
        PetType savedCatType = this.petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Kesavan");
        owner1.setLastName("Murali");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rajendran");
        owner2.setLastName("Thiruvengatam");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Prabhavathi");
        vet1.setLastName("Murali");

        vetService.save(vet1);
    }
}
