package com.xworkz.september.things;

public class School {
	public String name;
	public String place;
	public int numStudents;
	public int numTeachers;
	public String studentName;
	public School() {
		System.out.println("create a default construvtor");
	}
	
	public School(String name,String place,int numStudents, int numTeachers,String studentName) {
		this.name=name;
		this.place=place;
		this.numStudents=numStudents;
		this.numTeachers=numTeachers;
		this.studentName=studentName;
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.numStudents);
		System.out.println(this.numTeachers);
		System.out.println(this.studentName);
	}
	

}
