package com.haidarvm.hvmpetclinic.services;

import com.haidarvm.hvmpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);

    Set<Pet> findAll();
}
