package com.xworkz.september.driver;

import com.xworkz.september.things.Curd1;

public class Curd1Runner {
	public static void main(String[] args) {
		Curd1 curd1=new Curd1();
		curd1.getInformation("china");
		curd1.getInformation("argentina");
		curd1.getInformation("US");
		curd1.getInformation("belgium");
		curd1.getInformation("canada");
		curd1.getInformation("germany");
		curd1.getRead();
		curd1.getUpdate("belgium","dubai");
		curd1.getRead();
		System.out.println("................");
		curd1.getDelete("US");
		
		curd1.getRead();
		
		
	}

}
