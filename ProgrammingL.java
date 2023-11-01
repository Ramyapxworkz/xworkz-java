package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProgrammingL {
	private String name;
	private String level;
	private int year;
	
	public ProgrammingL() {
		System.out.println("No argument Constructor");
	}

	public ProgrammingL(String name, String level, int year) {
	
		this.name = name;
		this.level = level;
		this.year = year;
	}
	

}
