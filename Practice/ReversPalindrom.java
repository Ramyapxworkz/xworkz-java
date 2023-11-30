package com.xworkz.practice.thing;

import java.util.Scanner;

public class ReversPalindrom {
	public static void main(String[] args) {

		
		String word1="mnm";
		String rev="";
		System.out.println(word1.charAt(2));
		
		for(int i=0;i<word1.length();i++) {
			rev=word1.charAt(i)+rev;
			
			}
		
		System.out.println(rev);
		if(word1.equals(rev)) 
		{
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	    
			
		}

	}


