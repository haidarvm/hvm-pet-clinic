package com.haidarvm.hvmpetclinic.repositories;

import com.haidarvm.hvmpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
