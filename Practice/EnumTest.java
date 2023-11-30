package com.xworkz.practice.thing;

public class EnumTest {
	Day day;
	public EnumTest(Day day) {
		this.day=day;
	}
	public void tellItLikeIt() {
		switch(day)
		{
		case MONDAY:
			System.out.println("it is monday");
			break;
		case TUESDAY:
			System.out.println("it is TUESDAY");
			break;
			default:
				System.out.println("default value");
				
		}
	}

}
