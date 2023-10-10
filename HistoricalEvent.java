package com.xworkz.september.things;

public class HistoricalEvent {
	public String nameOfEvent;
	public String eventDate;
	public String location;
	public String description;
	public float investment;
	
	public HistoricalEvent(){
		System.out.println("no argument");
		
	}
	public HistoricalEvent(String nameOfEvent,String eventDate,String location,String description,float investment){
		this.nameOfEvent=nameOfEvent;
		this.eventDate=eventDate;
		this.location=location;
		this.description=description;
		this.investment=investment;
		
		System.out.println("Name of the event: "+this.nameOfEvent+" "+"Eventdate: "+this.eventDate+" "+"Location:"+this.location+" "+
		" Description: "+this.description+" "+"Investment:"+this.investment);
		
		
	}
	

}
