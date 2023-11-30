package com.xworkz.practice.thing;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total numbers");
		n=sc.nextInt();
		int sum=0;
		int mul=1;
		int[] elements=new int[5];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			elements[i]=sc.nextInt();
		}
		for(int i=0;i<elements.length;i++) {
			sum=sum+elements[i];
		}
		System.out.println("sum of elements:"+sum);
		System.out.println("average:"+(sum/elements.length));
		for(int i=elements.length-1;i>=0;i--) {
			System.out.println(elements[i]);
		}
		for(int i=0;i<elements.length;i++) {
			mul=mul*elements[i];
		}
		System.out.println("mul:"+mul);
	}

}
