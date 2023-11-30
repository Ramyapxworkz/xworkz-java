package com.xworkz.practice.driver;

import java.util.Scanner;

import com.xworkz.practice.thing.Example2;

public class Example2Runner {

		public static void main(String[] args) 
		
		{
	   Scanner scan=new Scanner(System.in);

	    System.out.println("Enter the Student marks");
	     int score=scan.nextInt();
	     Example2 g1=new Example2();
	     g1.grade(score);

		}

	}


