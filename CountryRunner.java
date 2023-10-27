package com.xworkz.september.driver;

import com.xworkz.september.things.Country;
import com.xworkz.september.things.State;

public class CountryRunner {
	public static void main(String[] args) {
		State s=new State();
		Country c=new Country();
		s.setName("Karnataka");
		s.setNumOfdistricts(31);
		s.setNumOfTaluks(227);
		c.setState(s);
	    System.out.println(c.getState().getName());
	    System.out.println(c.getState().getNumOfdistricts());
	    System.out.println(c.getState().getNumOfTaluks());
		
	}
	

}
