package com.xworkz.shopping.things;

import lombok.NoArgsConstructor;

//@NoArgsConstructor
public class  Employee extends Company {
	public Employee() {
		super("Guest Global","bangalure",22);
		System.out.println(super.getId());
		System.out.println(super.getLocation());
		System.out.println(super.getName());
		
	}
	

}
