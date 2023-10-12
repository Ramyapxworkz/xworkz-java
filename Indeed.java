package com.xworkz.september.things;

import java.util.Date;

public class Indeed {
	public String userName;
	public String paaWord;
	public String qualification;
	public String email;
	public Date date;
	public long number;
	public Indeed() {
		System.out.println("...............................");
	}
	public Indeed(String userName) {
		this("ramyap","ramyap@123");
		System.out.println("1.............................");
		this.userName=userName;
		System.out.println(this.userName);
	}
	public Indeed(String userName,String passWord) {
		this("ramyap","ramyap@123","BE");
		System.out.println("2...................................");
		this.userName=userName;
		this.paaWord=passWord;
		System.out.println(this.userName);
		System.out.println(this.paaWord);
	}
	public Indeed(String userName,String passWord,String qualification) {
		this("ramyap","ramyap@123","BE","rramyap@gmail.com");
		System.out.println("3........................");
		this.userName=userName;
		this.paaWord=passWord;
		this.qualification=qualification;
		System.out.println(this.userName);
		System.out.println(this.paaWord);
		System.out.println(this.qualification);
	}
	public Indeed(String userName,String passWord,String qualification,String email) {
		this("ramyap","ramyap@123","BE","rramyap@gmail.com",new Date(),6366276883l);
		System.out.println("4..........................");
		this.userName=userName;
		this.paaWord=passWord;
		this.qualification=qualification;
		this.email=email;
		System.out.println(this.userName);
		System.out.println(this.paaWord);
		System.out.println(this.qualification);
		System.out.println(this.email);
	}
	public Indeed(String userName,String passWord,String qualification,String email,Date date,long number)
	{
		this.userName=userName;
		this.paaWord=passWord;
		this.qualification=qualification;
		this.email=email;
		this.date=date;
		this.number=number;
		System.out.println(this.userName);
		System.out.println(this.paaWord);
		System.out.println(this.qualification);
		System.out.println(this.email);
		System.out.println(this.number);
	}
}
