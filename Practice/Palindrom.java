package com.xworkz.practice.thing;

import java.util.Scanner;

public class Palindrom {
         public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);

		   System.out.println("Enter number");
		   int num=sc.nextInt();
		   int rev=0;
		   int temp=num;
		   while(num>0) { 
			   rev=rev*10+num%10;
			   num=num/10;
			  // System.out.println(rev);
			   
		   }
		   if(temp==rev) {
			   System.out.println("It's palindrom");
		   }
		   else {
			   System.out.println("Its not a palindrom");
		   }
		}
}


