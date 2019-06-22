package com.haidarvm.hvmpetclinic.repositories;

import com.haidarvm.hvmpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
