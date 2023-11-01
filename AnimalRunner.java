package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Dog;

public class AnimalRunner {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setAge(16);
		d.setName("Golden retriever");
		d.setSpecies("canadian");
		System.out.println(d.getName());
		System.out.println(d.getSpecies());
		System.out.println(d.getAge());
	}

}
