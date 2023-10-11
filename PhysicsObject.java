package com.xworkz.september.things;

public class PhysicsObject {
	public String name;
	public double mass;
	public double velocity;
	public PhysicsObject() {
		System.out.println("default constructor...");
	}
	public PhysicsObject(String name) {
		this.name=name;
		System.out.println(this.name);
	}
	public PhysicsObject(String name,double mass,double velocity) {
		this.mass=mass;
		this.velocity=velocity;
		System.out.println(this.mass);
		System.out.println(this.velocity);
		
	}

}
