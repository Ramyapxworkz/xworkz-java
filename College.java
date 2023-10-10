package com.xworkz.september.things;

public class College {
	public String name;
	public String place;
	public int fees;
	public String course;
	public long ranking;
	public College() {
		System.out.println("creat Parameterized constructor");
	}
	public College(String name,String place,int fees,String course,long ranking) {
		this.name=name;
		this.place=place;
		this.fees=fees;
		this.course=course;
		this.ranking=ranking;
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.fees);
		System.out.println(this.course);
		System.out.println(this.ranking);
		
	}

}
