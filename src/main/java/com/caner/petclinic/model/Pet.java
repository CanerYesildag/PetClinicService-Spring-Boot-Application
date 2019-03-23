package com.caner.petclinic.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pet {
	
	private Long id;
	private String name;
	private Date date;
	
	private Set<Pet> pets = new HashSet<>();
	
	public Set<Pet> getPets() {
		return pets;
	}
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	

}
