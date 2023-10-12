package com.xworkz.september.things;

import java.util.Date;

public class Shine {
	public String userName;
	public String passWord;
	public String email;
	public int age;
	public Date date;
	public Shine() {
		System.out.println("...............");
	}
	public Shine(String userName) {
		this("Varun","rara4343");
		this.userName=userName;
		System.out.println(this.userName);
	}
	public Shine(String userName,String passWord) {
		this("Varun","rara4343","rramyap@121gmail.com");
		this.userName=userName;
		System.out.println(this.userName);
		this.passWord=passWord;
		System.out.println(this.passWord);
	}
	public Shine(String userName,String passWord,String email) {
		this("Varun","rara4343","rramyap@121gmail.com",22);
		this.userName=userName;
		System.out.println(this.userName);
		this.passWord=passWord;
		System.out.println(this.passWord);
		this.email=email;
		System.out.println(this.email);
		
	}
	public Shine(String userName,String passWord,String email,int age) {
		this("Varun","rara4343","rramyap@121gmail.com",22,new Date());
		this.userName=userName;
		System.out.println(this.userName);
		this.passWord=passWord;
		System.out.println(this.passWord);
		this.email=email;
		System.out.println(this.email);
		this.age=age;
		System.out.println(this.age);
	}
	public Shine(String userName,String passWord,String email,int age,Date date) {
		this.userName=userName;
		System.out.println(this.userName);
		this.passWord=passWord;
		System.out.println(this.passWord);
		this.email=email;
		System.out.println(this.email);
		this.age=age;
		System.out.println(this.age);
		this.date=date;
		System.out.println(this.date);
	}

}
