package com.caner.petclinic.service;

import java.util.List;

import com.caner.petclinic.exceptions.OwnerNotFoundException;
import com.caner.petclinic.model.Owner;

public interface PetclinicService {

	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void createOwner(Owner owner);
	void updateOwner(Owner owner);
	void deleteOwner(Long id);
}
