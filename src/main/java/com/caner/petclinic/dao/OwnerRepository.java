package com.caner.petclinic.dao;

import java.util.List;

import com.caner.petclinic.model.Owner;

public interface OwnerRepository {

	List<Owner> findall();
	Owner findbyId(Long id);
	List<Owner> findbyLastName(String lastname);
	void create(Owner owner);
	Owner update(Owner owner);
	void deletebyId(Long id);
	
}
