package com.xworkz.september.driver;

import com.xworkz.september.things.College;
public class CollegeRunner {
	public static void main(String args[]) {
		College college=new College();
		college.name="JNNCE";
		college.place="Shimoga";
		college.course="BE";
		college.fees=65000;
		college.ranking=20000;
		System.out.println(college.name);
		System.out.println(college.place);
		System.out.println(college.course);
	    System.out.println(college.fees);
	    System.out.println(college.ranking);
	    
	    System.out.println("creat second object");
	    College college1=new College();
		college1.name="PESET";
		college1.place="Shimoga";
		college1.course="BE";
		college1.fees=60000;
		college1.ranking=30000;
		System.out.println(college1.name);
		System.out.println(college1.place);
		System.out.println(college1.course);
	    System.out.println(college1.fees);
	    System.out.println(college1.ranking);
	    
	    System.out.println("creat 3rd object");
	    
	    College college2=new College();
		college2.name="BIT";
		college2.place="DVG";
		college2.course="BE";
		college2.fees=75000;
		college2.ranking=40000;
		System.out.println(college2.name);
		System.out.println(college2.place);
		System.out.println(college2.course);
	    System.out.println(college2.fees);
	    System.out.println(college2.ranking);
	    
	    
	    new College("UBDT","DVG",10000,"BE",3000);
	}

}
