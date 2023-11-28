package com.xworkz.education.runner;

import com.xworkz.education.abstracts.Education;

public class Undergraduate extends Education {

	@Override
	public void method() {
		System.out.println("Get Information");
		
	}

	@Override
	public String method1(String collegeName) {
		// TODO Auto-generated method stub
		return "College name:"+collegeName;
		
		
	}

	@Override
	public String addLearningEnvironment(String location) {
		// TODO Auto-generated method 
		return "Location:"+location;
		
		
		
	}

	@Override
	public void addProperty() {
		System.out.println("Add properties");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProperty() {
		System.out.println("Remove Properties");
		// TODO Auto-generated method stub
		
	}
	

}
