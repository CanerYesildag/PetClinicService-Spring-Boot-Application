package com.caner.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caner.petclinic.dao.OwnerRepository;
import com.caner.petclinic.exceptions.OwnerNotFoundException;
import com.caner.petclinic.model.Owner;

@Service
public class PetclinicServiceImpl implements PetclinicService {
	
  @Autowired
  private OwnerRepository  ownerRepository;
  
	
	@Override
	public List<Owner> findOwners() {
		return ownerRepository.findall();
	}

	@Override
	public List<Owner> findOwners(String lastName) {
		return ownerRepository.findbyLastName(lastName);
	}

	@Override
	public Owner findOwner(Long id) throws OwnerNotFoundException {
		return ownerRepository.findbyId(id);
	}

	@Override
	public void createOwner(Owner owner) {
		ownerRepository.create(owner);

	}

	@Override
	public void updateOwner(Owner owner) {
		ownerRepository.update(owner);

	}

	@Override
	public void deleteOwner(Long id) {
		ownerRepository.deletebyId(id);

	}

}
