package com.xworkz.september.things;

public class Sweet {
	public String name;
	public int calories;
	public int water;
	public float protein;
	public float sugar;
	
	public Sweet() {
		System.out.println(" constructor");
	}
	public Sweet(String name,int calories,int water,float protein,float sugar)
	{
		this.name=name;
		this.calories=calories;
		this.protein=protein;
		this.water=water;
		this.sugar=sugar;
		System.out.println(this.name);
		System.out.println(this.calories);
		System.out.println(this.protein);
		System.out.println(this.water);
		System.out.println(this.sugar);
		
	}
	
	

}
