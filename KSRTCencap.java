package com.xworkz.september.things;

public class KSRTCencap {
	private String busName;
	private String busNumber;
	private int numOfSeats;
	private String to;
	private String from;
	public KSRTCencap() {
		System.out.println("default constructor.................");
	}
	public KSRTCencap(String busName,String busNumber,int numOfSeats,String to,String from) {
		this.busName=busName;
		this.busNumber=busNumber;
		this.numOfSeats=numOfSeats;
		this.to=to;
		this.from=from;
		System.out.println(this.busName);
		System.out.println(this.busNumber);
		System.out.println(this.numOfSeats);
		System.out.println(this.to);
		System.out.println(this.from);
	}
	public void setbusName(String busName) {
		this.busName=busName;
		
	}
	public  String getName() {
		return this.busName;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber=busNumber;
	}
	public String getBusNumber() {
		return this.busNumber;
	}
	public void setSeatNumber(int numOfSeats) {
		this.numOfSeats=numOfSeats;
	}
	public int getSeatNumber() {
		return this.numOfSeats;
	}
	
	public void setFrom(String from){
		this.from=from;
	}
	public String getFrom() {
		return this.from;
	}
	public void setTo(String to) {
		this.to=to;
		
	}
public String getTo() {
	return this.to;
}
   
}
