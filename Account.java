package com.xworkz.shopping.things;

public class Account extends Bank{
	
	public Account() {
		super("Canara Bank","Taniger","5656565656");
		System.out.println(super.getName());
		System.out.println(super.getBranch());
		System.out.println(super.getAccountNum());
	}

}
