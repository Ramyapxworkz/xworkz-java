package com.xworkz.september.driver;

import com.xworkz.september.things.KSRTCencap;

public class KSRTCencapRunner {
	public static void main(String[] args) {
		KSRTCencap ksrtcCencap=new KSRTCencap();
		
	new KSRTCencap("KSRTC","KA-18F-704",47,"davangere","bangalore");
	ksrtcCencap.setbusName("KSRTC");
	String name=ksrtcCencap.getName();
	System.out.println(name);
	ksrtcCencap.setBusNumber("KA-18F-704");
	String busNumber=ksrtcCencap.getBusNumber();
	System.out.println(busNumber);
	
	ksrtcCencap.setSeatNumber(47);
	int number=ksrtcCencap.getSeatNumber();
	System.out.println(number);
	
	ksrtcCencap.setFrom("Davanagere");
	String from=ksrtcCencap.getFrom();
	System.out.println(from);
	
	ksrtcCencap.setTo("Dharwad");
	String to=ksrtcCencap.getTo();
	System.out.println(to);
	
	
	
	
	}

}
