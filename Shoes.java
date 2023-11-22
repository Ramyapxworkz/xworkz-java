package com.xworkz.shopping.things;

public class Shoes {
	private String name;
	private int size;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Shoes(String name, int size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shoe Name: "+name+" Shoe size: "+size+" Shoe price: " +price;
	}
	public int hashcode() {
		return 9;
	}
	
	

}
