package com.xworkz.september.things;

import java.util.Date;

public class Instagram1 {
	public String userName;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date date;
	public String gender;
	// constructor 1
	public Instagram1() {
		this("Ramya_111","ramyap@123");
		System.out.println("....................");
	}
	public Instagram1(String userName) {
		this();
		System.out.println(" passing 1..... argument");
		this.userName=userName;
		System.out.println(this.userName);
		
	}
	public Instagram1(String userName,String password) {
		//this("Ramya_111","ramyap@123","rramyap@gmail.com");
		System.out.println(" passing 2..... argument");
		this.userName=userName;
		this.password=password;
		System.out.println(this.userName);
		System.out.println(this.password);
	}
	public Instagram1(String userName,String password,String email) {
		
		this("Ramya_111","ramyap@123","rramyap@gmail.com",6366276883l);
		System.out.println(" passing 3..... argument");
		this.userName=userName;
		this.password=password;
		this.email=email;
		System.out.println(this.userName);
		System.out.println(this.password);
		System.out.println(this.email);
	}
	public Instagram1(String userName,String password,String email,long contactNumber) {
		//this("Ramya_111","ramyap@123","rramyap@gmail.com",6366276883l,"D/O palakshappa Medikere");
		System.out.println(" passing 4.... argument");
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		System.out.println(this.userName);
		System.out.println(this.password);
		System.out.println(this.email);
		System.out.println(this.contactNumber);
	}
	
	public Instagram1(String userName,String password,String email,long contactNumber,String address) {
		//this("Ramya_111","ramyap@123","rramyap@gmail.com",6366276883l,"D/O palakshappa Medikere",new Date());
		System.out.println(" passing 5.... argument");
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		this.address=address;
		System.out.println(this.userName);
		System.out.println(this.password);
		System.out.println(this.email);
		System.out.println(this.contactNumber);
		System.out.println(this.address);
	}
	public Instagram1(String userName,String password,String email,long contactNumber,String address,Date date) {
		System.out.println(" passing 6..... argument");
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		this.address=address;
		this.date=date;
		
		System.out.println(this.userName);
		System.out.println(this.password);
		System.out.println(this.email);
		System.out.println(this.contactNumber);
		System.out.println(this.address);
		System.out.println(this.date);
		
		
		
		
	}
	
	

}
