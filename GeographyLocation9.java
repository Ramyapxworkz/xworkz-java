package com.xworkz.september.things;

public class GeographyLocation9 {
	public String name;
    public double latitude;
    public double longitude;
    public double elevation;
    public double area;
    public String climate;
    public GeographyLocation9 () {
    	System.out.println("...........");
    }
    public GeographyLocation9 (String name,double latitude,double longitude) {
    	this.name=name;
    	this.latitude=latitude;
    	this.longitude=longitude;
    	System.out.println(this.name);
    	System.out.println(this.latitude);
    	System.out.println(this.longitude);
    }
    public GeographyLocation9 (String name,double latitude,double longitude,double elevation,double area,String climate)
    {
    	this.elevation=elevation;
    	this.area=area;
    	this.climate=climate;
    	System.out.println(this.elevation);
    	System.out.println(this.area);
    	System.out.println(this.climate);
    }

}
