package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
	private String name;
	private String branch;
	private String accountNum;
	
	public Bank() {
		System.out.println("No argument constructor");
	}
	public Bank(String name,String branch,String accountNum) {
		this.name=name;
		this.branch=branch;
		this.accountNum=accountNum;
		
	}
	

}
