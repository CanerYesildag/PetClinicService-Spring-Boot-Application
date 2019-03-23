package com.caner.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value=PetclinicProperties.class)
public class petclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(petclinicApplication.class,args);
		

	}
}
