package com.xworkz.september.things;

public class ComputerScience {
	public String name;
	public String type;
	public String state;
	public ComputerScience() {
		System.out.println("........");
	}
	public ComputerScience(String name,String type,String state) {
		this.name=name;
		this.state=state;
		this.type=type;
		System.out.println(this.name);
		System.out.println(this.state);
		System.out.println(this.type);
	}
	

}
