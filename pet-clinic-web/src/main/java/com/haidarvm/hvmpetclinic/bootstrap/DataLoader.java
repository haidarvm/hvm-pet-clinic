package com.haidarvm.hvmpetclinic.bootstrap;

import com.haidarvm.hvmpetclinic.model.Owner;
import com.haidarvm.hvmpetclinic.model.PetType;
import com.haidarvm.hvmpetclinic.model.Vet;
import com.haidarvm.hvmpetclinic.services.OwnerService;
import com.haidarvm.hvmpetclinic.services.PetTypeService;
import com.haidarvm.hvmpetclinic.services.VetService;
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
        dog.setName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedcatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Haidar");
        owner1.setLastName("vm");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Dini");
        owner2.setLastName("Julia");

        ownerService.save(owner2);

        System.out.println("Loaded Owneres ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Uwais");
        vet1.setLastName("Alfahim");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ridwan");
        vet2.setLastName("Haidar");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");

    }
}
