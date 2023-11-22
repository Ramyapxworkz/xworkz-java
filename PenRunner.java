package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Pen;

public class PenRunner {
	public static void main(String[] args) {
		Pen p=new Pen("Brigth",5,"blue");
		Pen p1=new Pen("Acton bell",6,"red");
		Pen p2=new Pen("Brigth",5,"blue");
		Pen p4=p;
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println(p.equals(p4));
		System.out.println(p.getClass());
		
		
	}

}
