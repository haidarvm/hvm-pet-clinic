package com.haidarvm.hvmpetclinic.services;

import com.haidarvm.hvmpetclinic.model.Owner;


public interface OwnerService  extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
