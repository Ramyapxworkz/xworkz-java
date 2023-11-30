package com.xworkz.practice.thing;

public class FirstQX {
	
		//int num=9119;
		public static int  firstDigit(int num) {
			while(num>=10) 
			num=num/10;
					return num;
		}
		public static int lastDigit(int num) {
			num=num%10;
			return num;
		}
		public static void main(String[] args) {
			int num=5656;
			System.out.println(firstDigit(num));
			System.out.println(lastDigit(num));
			
		}
	

}
