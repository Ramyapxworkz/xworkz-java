package com.xworkz.september.things;

public class Economic8 {
	public String name;
    public double value;
    public String unit;
    public String source;
    public Economic8() {
    	System.out.println(".............");
    }
    public Economic8(String name,double value) {
    	this.name=name;
    	this.value=value;
    	System.out.println(this.name);
    	System.out.println(this.value);
    }
    public Economic8(String name,double value,String unit,String source)
    {
    	this.unit=unit;
    	this.source=source;
    	System.out.println(this.unit);
    	System.out.println(this.source);
    }
}
