package com.caner.petclinic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="petclinic") // Bu anotasyon ile properties dosyasında propertileri tanımlayabiliriz.
public class PetclinicProperties {
	private boolean displayOwnersWithPets = false;

	public boolean isDisplayOwnersWithPets() {
		return displayOwnersWithPets;
	}

	public void setDisplayOwnersWithPets(boolean displayOwnersWithPets) {
		this.displayOwnersWithPets = displayOwnersWithPets;
	}
	
	

}
