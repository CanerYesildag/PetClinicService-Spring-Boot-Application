package com.caner.petclinic.dao;

import java.util.List;

import com.caner.petclinic.model.Pet;

public interface PetRepository {
	List<Pet> findbyId(Long id);
	Pet findbyOwnerId(Long ownerId);
	void create(Pet pet);
	Pet update(Pet pet);
	void delete(Long id);
	void deleteByOwnerId(Long ownerId);

}
