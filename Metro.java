package com.xworkz.september.things;

public class Metro {
	public String stationName;
	public String lineName;
	public String location;
	public String connectivity;
	public String facilities;
	public Metro() {
		System.out.println(" ..............");
	}
	public Metro(String stationName,String lineName,String location,String connectivity,String facilities) {
		this.stationName=stationName;
		this.lineName=lineName;
		this.location=location;
		this.connectivity=connectivity;
		this.facilities=facilities;
		System.out.println(this.stationName);
		System.out.println(this.lineName);
		System.out.println(this.location);
		System.out.println(this.connectivity);
		System.out.println(this.facilities);
	}

}
