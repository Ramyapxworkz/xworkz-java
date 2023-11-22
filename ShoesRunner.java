package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Shoes;

public class ShoesRunner {
public static void main(String[] args) {
	Shoes s=new Shoes("Liberty",8,18000);
	Shoes s1=new Shoes("puma",7,1000);
	Shoes s2=new Shoes("Liberty",8,18000);
	Shoes s4=s;
	System.out.println(s.getClass());
	System.out.println(s.toString());
	System.out.println(s.hashCode());
	System.out.println(s.hashcode());
	System.out.println(s.equals(s4));
	System.out.println(s.equals(s2));
    
	
}
}
