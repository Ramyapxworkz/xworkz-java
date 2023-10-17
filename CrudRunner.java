package com.xworkz.september.driver;

import com.xworkz.september.things.Crud;

public class CrudRunner {
	public static void main(String[] args) {
		Crud crud=new Crud();
		crud.getSave("ECE");
		crud.getSave("CSE");
		crud.getSave("ISE");
		crud.getSave("Civil");
		crud.getRead();
		crud.getUpdate("ISE", "Mechanical");
		crud.getRead();
		crud.getDelete("Civil");
		crud.getRead();
	}

}
