package com.xworkz.september.driver;

import com.xworkz.september.things.Chemistry;

public class ChemistryRunner {
	public static void main(String args[]) {
		new Chemistry();
		new Chemistry("Hydrogen",1.008);
		new Chemistry("Hydrogen",1.008,"H",1,"nonMetals");
	}

}
