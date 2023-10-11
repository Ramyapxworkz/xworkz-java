package com.xworkz.september.driver;

import com.xworkz.september.things.PhysicsObject;

public class PhysicsObjectRunner {
	public static void main(String args[]) {
		new PhysicsObject();
		new PhysicsObject("Particle A");
		new PhysicsObject("Particle A",0.01,5.0);
		
	}

}
