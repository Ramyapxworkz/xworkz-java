package com.xworkz.september.things;

import java.util.Date;

public class Telegram {
	public String userName;
	public String passWord;
	public String age;
	public String email;
	public long number;
	public Date accountDate;
	public String dOB;
	// 1 constructor
	public Telegram() {
		System.out.println("Creat no argument constructor");
		System.out.println("1...................");
	}
	//2 constructor
	public Telegram(String userName) {
		this("Rmayp_123","ramyap@123");
		System.out.println("2....................");
		this.userName=userName;
		System.out.println(this.userName);
	}
	//3 constructor
	public Telegram(String userName,String passWord)
	{
		this("Rmayp_123","ramyap@123","21");
		System.out.println("3....................");
		this.userName=userName;
		this.passWord=passWord;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		
	}
	//4 constructor
	public Telegram(String userName,String passWord,String age) {
		this("Rmayp_123","ramyap@123","21","rramyap@gamil.com");
		System.out.println("4.............");
		this.userName=userName;
		this.passWord=passWord;
		this.age=age;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.age);
	}
	//5 constructor
	public Telegram(String userName,String passWord,String age,String email) {
		System.out.println("5..........................");
		this.userName=userName;
		this.passWord=passWord;
		this.age=age;
		this.email=email;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.age);
		System.out.println(this.email);
		
	}
	// 6 constructor
	public Telegram(String userName,String passWord,String age,String email,long number) {
		this("Rmayp_123","ramyap@123","21","rramyap@gamil.com",6366276883l,new Date());
		System.out.println("6......................");
		this.userName=userName;
		this.passWord=passWord;
		this.age=age;
		this.email=email;
		this.number=number;
		
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.age);
		System.out.println(this.email);
		System.out.println(this.number);
		
	}
	//7 constructor
	public Telegram(String userName,String passWord,String age,String email,long number,Date accountDate) {
		System.out.println("7.....................");
		this.userName=userName;
		this.passWord=passWord;
		this.age=age;
		this.email=email;
		this.number=number;
		this.accountDate=accountDate;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.age);
		System.out.println(this.email);
		System.out.println(this.number);
		System.out.println(this.accountDate);
	}
	//8 constructor
	public Telegram(String userName,String passWord,String age,String email,long number,Date accountDate,String dOB ) {
		System.out.println("8...........................");
		this.userName=userName;
		this.passWord=passWord;
		this.age=age;
		this.email=email;
		this.number=number;
		this.accountDate=accountDate;
		this.dOB=dOB;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.age);
		System.out.println(this.email);
		System.out.println(this.number);
		System.out.println(this.accountDate);
		System.out.println(this.dOB);
	}
	
	

}
