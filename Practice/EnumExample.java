package com.xworkz.practice.thing;

public class EnumExample {
	public enum Days{MONDAY,TUESDAY}
	public static void main(String[] args) {
		Day d=Day.MONDAY;
		System.out.println(d);
		for(Days f:Days.values()) {
			System.out.println(f);
		}
		System.out.println(d.valueOf("MONDAY"));
	}

}
