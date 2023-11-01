package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Language;

public class ProgramminLRunner {
	public static void main(String[] args) {
		Language language=new Language();
		language.setName("java");
		language.setLevel("High level");
		language.setYear(2018);
		System.out.println(language.getName());
		System.out.println(language.getLevel());
		System.out.println(language.getYear());
	}

}
