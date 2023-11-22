package com.xworkz.shopping.things;

public class Toy {
	private String name;
	private int price;
	private int numofToys;
	private boolean fun;
	public Toy(String name, int price, int numofToys, boolean fun) {
		//super();
		this.name = name;
		this.price = price;
		this.numofToys = numofToys;
		this.fun = fun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumofToys() {
		return numofToys;
	}
	public void setNumofToys(int numofToys) {
		this.numofToys = numofToys;
	}
	public boolean isFun() {
		return fun;
	}
	public void setFun(boolean fun) {
		this.fun = fun;
	}
	
	public String toString() {
		return "Toy name: "+name+" Toy price: "+price+" Num of Toys: "+numofToys+" Fun: " +fun;
	}
	public int hashcode() {
		return 7;
	}
	

}
