package com.xworkz.shopping.things;

public class Vehicle {
	public String name;
	public String price;
	//inner class
	public class Car{
		public String name;
		public String brand;
		public String price;
	public Car() {
		System.out.println("inner class No argument constructor");
	}
	public Car(String name,String brand,String price) {
		this();
		this.name=name;
		this.brand=brand;
		this.price=price;
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.price);
		
	}
	}

}
