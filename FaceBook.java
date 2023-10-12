package com.xworkz.september.things;

import java.util.Date;

public class FaceBook {
	public String userName;
	public String passWord;
	public long number;
	public String gender;
	public Date date;
	public String email;
	
	public FaceBook() {
		System.out.println("1.............................");
	}
	public FaceBook(String userName) {
		this.userName=userName;
		System.out.println(this.userName);
	}
	public FaceBook(String userName,String passWord) {
		this("ramyap_12344","ramyap",6366276883l);
		this.userName=userName;
		this.passWord=passWord;
		System.out.println(this.userName);
		System.out.println(this.passWord);
	}
	public FaceBook(String userName,String passWord,long number) {
		this("ramyap_12344","ramyap",6366276883l,"Female");
		this.userName=userName;
		this.passWord=passWord;
		this.number=number;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.number);
	}
    public FaceBook(String userName,String passWord,long number,String gender) {
    	this("ramyap_12344","ramyap",6366276883l,"Female",new Date());
    	this.userName=userName;
		this.passWord=passWord;
		this.number=number;
		this.gender=gender;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.number);
		System.out.println(this.gender);
    }
    public FaceBook(String userName,String passWord,long number,String gender,Date date) {
    	this("ramyap_12344","ramyap",6366276883l,"Female",new Date(),"rramyap920@gmail.com");
    	this.userName=userName;
		this.passWord=passWord;
		this.number=number;
		this.gender=gender;
		this.date=date;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.number);
		System.out.println(this.gender);
		System.out.println(this.date);
		
    }
    public FaceBook(String userName,String passWord,long number,String gender,Date date,String email) {
    	this.userName=userName;
		this.passWord=passWord;
		this.number=number;
		this.gender=gender;
		this.date=date;
		this.email=email;
		System.out.println(this.userName);
		System.out.println(this.passWord);
		System.out.println(this.number);
		System.out.println(this.gender);
		System.out.println(this.date);
		System.out.println(this.email);
    }
}
