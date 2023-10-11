package com.xworkz.september.driver;

import com.xworkz.september.things.Metro;

public class MetroRunner {
	public static void main(String args[]) {
		new Metro();
		new Metro(  "Central Station",
	            "Red Line",
	            "Latitude: 40.7128, Longitude: -74.0060",
	            "Connects to Green Line, Bus Route 32",
	            "Ticket booth, Restrooms, Elevators");
	}
}
