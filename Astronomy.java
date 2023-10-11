package com.xworkz.september.things;

public class Astronomy {
	public String name;
	public String type;
	public String location;
	public String characteristics;
	public String significance;
	public Astronomy() {
		System.out.println(" ..............");
	}
	public Astronomy(String name,String type,String location,String characteristics,String significance) {
		this.name=name;
		this.type=type;
		this.location=location;
		this.characteristics=characteristics;
		this.significance=significance;
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.location);
		System.out.println(this.characteristics);
		System.out.println(this.significance);
	}
}
