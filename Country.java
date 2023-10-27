package com.xworkz.september.things;

public class Country {
	private State state;

	public Country() {
		System.out.println("no argument1");
	}
	public Country(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	

	
}
