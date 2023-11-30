package com.xworkz.practice.thing;



public class ScoreCal {
	
	
	public void grade(int score) {
		System.out.println();
		if(score>=90) {
			System.out.println("Distinction");
		}
		else if(score>=70 && score<=90) {
			System.out.println("first class");
		}
		else {
			System.out.println("pass");
		}
	}

}
