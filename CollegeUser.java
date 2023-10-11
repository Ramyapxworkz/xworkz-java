package com.xworkz.september.things;

public class CollegeUser {
	public String  name;
	public int  numOfStudent;
	public String nameOfStudent;
	public String usn;
	public CollegeUser() {
		System.out.println("...........");
	}
	public CollegeUser(String name,int numOfStudent,String nameOfStudent,String usn)
	{
		this.name=name;
		this.nameOfStudent=nameOfStudent;
		this.numOfStudent=numOfStudent;
		this.usn=usn;
		System.out.println(this.name);
		System.out.println(this.nameOfStudent);
		System.out.println(this.numOfStudent);
		System.out.println(this.usn);
	}

}
