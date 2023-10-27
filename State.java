package com.xworkz.september.things;

public class State {
	private String name;
	private int numOfdistricts;
	private int numOfTaluks;
	public State() {
		System.out.println("no argument");
	}
	public State(String name, int numOfdistricts, int numOfTaluks) {
		super();
		this.name = name;
		this.numOfdistricts = numOfdistricts;
		this.numOfTaluks = numOfTaluks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfdistricts() {
		return numOfdistricts;
	}
	public void setNumOfdistricts(int numOfdistricts) {
		this.numOfdistricts = numOfdistricts;
	}
	public int getNumOfTaluks() {
		return numOfTaluks;
	}
	public void setNumOfTaluks(int numOfTaluks) {
		this.numOfTaluks = numOfTaluks;
	}
	
	
	

}
