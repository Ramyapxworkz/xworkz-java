package com.xworkz.september.driver;

import com.xworkz.september.things.School;
public class SchoolRunner {
	public static void main(String[] args) {
		School school= new School();
		school.name="SGHS";
		school.place="Medikere";
		school.numStudents=56;
		school.numTeachers=12;
		school.studentName="ramya";
		System.out.println(school.name);
		System.out.println(school.place);
		System.out.println(school.numStudents);
		System.out.println(school.numTeachers);
		System.out.println(school.studentName);
		
		System.out.println("creat another object");
		School school1= new School();
		school1.name="SGH";
		school1.place="DVG";
		school1.numStudents=58;
		school1.numTeachers=11;
		school1.studentName="gjghh";
		System.out.println(school1.name);
		System.out.println(school1.place);
		System.out.println(school1.numStudents);
		System.out.println(school1.numTeachers);
		System.out.println(school1.studentName);
		
		System.out.println("creat an object");
		School school2=new School();
		school2.name="SSGVP";
		school2.place="Santebennur";
		school2.numStudents=45;
		school2.numTeachers=10;
		school2.studentName="vafaf";
		System.out.println(school2.name);
		System.out.println(school2.place);
		System.out.println(school2.numStudents);
		System.out.println(school2.numTeachers);
		System.out.println(school2.studentName);
		
		System.out.println("print a parameterized variable");
		
		new School("SSGVP", "Santebennur", 45, 10, "vafaf");
		
		
		
		
		
		
	}

}
