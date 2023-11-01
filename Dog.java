package com.xworkz.shopping.things;

import lombok.NoArgsConstructor;

//@NoArgsConstructor

public class Dog extends Animal{
	public Dog() {
		super("Bacon","Canidae",15);
		System.out.println(super.getName());
		System.out.println(super.getSpecies());
		System.out.println(super.getAge());
		System.out.println("huhuhuhu.............");
		
	}
}
