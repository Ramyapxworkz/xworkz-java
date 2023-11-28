package com.xworkz.education;

import com.xworkz.education.abstracts.Education;
import com.xworkz.education.runner.Undergraduate;

public class EducationRunner {
	public static void main(String[] args) {
		Education e=new Undergraduate();
		e.method();
		System.out.println(e.method1("JNNCE"));
		e.addProperty();
		System.out.println(e.addLearningEnvironment("Shimoga"));
		e.removeProperty();
		
	}

}
