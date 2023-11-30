package com.xworkz.practice.driver;

import java.util.Scanner;

import com.xworkz.practice.thing.ScoreCal;

public class ScoreCalRunner {
	public static void main(String[] args) {
		ScoreCal s=new ScoreCal();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");

		int score=sc.nextInt();

		s.grade(score);
		
		
	}

}
