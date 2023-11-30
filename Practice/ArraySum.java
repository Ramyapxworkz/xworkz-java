package com.xworkz.practice.thing;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		int[] elements= {1,2,3,6,3,3,4,2,4};
		int r=3;
		int count=0;
		for(int i=0;i<elements.length;i++) {
			System.out.println(elements[i]);
			if(r==elements[i]) {
				count++;
				//System.out.println("elements");
			}
		}
		System.out.println("values:"+count);
		
		
	}

}
