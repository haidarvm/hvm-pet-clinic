package com.haidarvm.hvmpetclinic.bootstrap;

import com.haidarvm.hvmpetclinic.model.Owner;
import com.haidarvm.hvmpetclinic.model.Pet;
import com.haidarvm.hvmpetclinic.model.PetType;
import com.haidarvm.hvmpetclinic.model.Vet;
import com.haidarvm.hvmpetclinic.services.OwnerService;
import com.haidarvm.hvmpetclinic.services.PetTypeService;
import com.haidarvm.hvmpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Haidar");
        owner1.setLastName("vm");
        owner1.setAddress("123 Buckerel");
        owner1.setCity("Miamy");
        owner1.setTelephone("1231243242");

        Pet haidarPet = new Pet();
        haidarPet.setPetType(savedDogType);
        haidarPet.setOwner(owner1);
        haidarPet.setBirthDate(LocalDate.now());
        haidarPet.setName("Ledo");
        owner1.getPets().add(haidarPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Dini");
        owner2.setLastName("Julia");
        owner2.setAddress("123 Montgomery");
        owner2.setCity("Silver Spring");
        owner2.setTelephone("4352214321");

        Pet diniCat = new Pet();
        diniCat.setPetType(savedCatType);
        diniCat.setOwner(owner2);
        diniCat.setBirthDate(LocalDate.now());
        diniCat.setName("roro");
        owner2.getPets().add(diniCat);
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
