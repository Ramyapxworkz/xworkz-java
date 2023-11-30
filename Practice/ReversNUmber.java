package com.xworkz.practice.thing;

public class ReversNUmber {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int rev=0;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
