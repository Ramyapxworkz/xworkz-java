package com.xworkz.practice.thing;

import java.util.Scanner;

public class Arm {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the num");
		 int n=sc.nextInt();
		int temp = n;
		int sum = 0;
		int count = 0;
		int z = n;
		while (temp > 0) {
			temp = temp / 10;
			System.out.println("Tem:"+temp);
			count++;

		}
		System.out.println(count);
		while (n > 0) {
			int r = 1;
			int b = n % 10;
			for (int i = 0; i < count; i++) {
				r = r * b;
			}
			sum = sum + r;
			n = n / 10;
		}
	if (z == sum) {
			System.out.println("number is armstrong number");
		} else {
			System.out.println("number is not armstrong number");
		}
	}
}
