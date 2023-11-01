package com.xworkz.shopping.things;

import lombok.NoArgsConstructor;

//@NoArgsConstructor

public class Language extends ProgrammingL{
	private String language;
	public Language() {
		super("C","Initial level",2000);
		this.language=language;
		System.out.println(this.language);
		
		System.out.println("Java"+language );
		System.out.println(super.getName());
		System.out.println(super.getLevel());
		System.out.println(super.getYear());
		
	}

}
