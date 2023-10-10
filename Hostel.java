package com.xworkz.september.things;

public class Hostel {
	public String name;
	public int numOfPeoples;
	public boolean food;
	public int perRoom;
	public int rent;
	
	public Hostel() {
		System.out.println("parameterized constructor");
		
	}
	public Hostel(String name,int numOfPeoples,boolean food,int perRoom,int rent) {
		this.name=name;
		this.food=food;
		this.numOfPeoples=numOfPeoples;
		this.perRoom=perRoom;
		this.rent=rent;
		System.out.println(this.name);
		System.out.println(this.food);
		System.out.println(this.numOfPeoples);
		System.out.println(this.perRoom);
		System.out.println(this.rent);
	}

}
