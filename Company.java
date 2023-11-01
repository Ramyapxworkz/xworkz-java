package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Company {
	private String name;
	private String location;
	private int id;
	public Company() {
		System.out.println("No argument constructor");
	}
	public Company(String name, String location, int id) {
		this.name = name;
		this.location = location;
		this.id = id;
	}
	
	

}
