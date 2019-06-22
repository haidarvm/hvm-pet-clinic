package com.haidarvm.hvmpetclinic.repositories;

import com.haidarvm.hvmpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
