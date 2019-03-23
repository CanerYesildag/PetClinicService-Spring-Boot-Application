package com.caner.petclinic;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetclinicConfiguration {

	@Autowired
	private PetclinicProperties petclinicProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Display owner with pet :" + petclinicProperties.isDisplayOwnersWithPets());
		
	}
	
}
