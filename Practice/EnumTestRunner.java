package com.xworkz.practice.driver;

import com.xworkz.practice.thing.Day;
import com.xworkz.practice.thing.EnumTest;

public class EnumTestRunner {
	public static void main(String[] args) {
		EnumTest e= new EnumTest(Day.MONDAY);
		e.tellItLikeIt();
		EnumTest e1= new EnumTest(Day.THURSDAY);
        e1.tellItLikeIt();
		
	}

}
