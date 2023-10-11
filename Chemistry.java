package com.xworkz.september.things;

public class Chemistry {
	public String element;
	public double atomicWeight;
	public String symbol;
	public int atomicNumber;
	public String group;
	public Chemistry(){
		System.out.println("Default constructor....");
		
	}
	public Chemistry(String element,double atomicWeight) {
		this.element=element;
		this.atomicWeight=atomicWeight;
		System.out.println(this.element);
		System.out.println(this.atomicWeight);
	}
	public Chemistry(String element,double atomicWeight,String symbol,int atomicNumber,String group) {
		this.symbol=symbol;
		this.atomicNumber=atomicNumber;
		this.group=group;
		System.out.println(this.symbol);
		System.out.println(this.atomicNumber);
		System.out.println(this.group);
	}

}
