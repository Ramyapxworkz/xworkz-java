package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Animal {
	
	private String name;
	private String species;
	private int age;
	//private String habitat;
	public Animal() {
		System.out.println("no argument constructor");
	}
	
	public Animal(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
		//this.habitat = habitat;
	}
	

}
