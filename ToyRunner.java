package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Toy;

public class ToyRunner {
     public static void main(String[] args) {
		Toy t = new Toy("Dog",200,6,true);
		Toy t1=new Toy("cat",300,7,false);
		Toy t2=new Toy("cat",300,7,false);
		Toy t4=t;
		System.out.println(t.getClass());
		System.out.println(t.toString());
		System.out.println(t.hashcode());
		System.out.println(t.equals(t4));
		
		
	}
}
