package com.xworkz.practice.driver;

public class String1 {
	public static void main(String[] args) {
		String string=new String("Ramya");
		System.out.println(string.charAt(2));
		
		long start=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Hello");
		for(int i=0;i<1000;i++) {
			sb.append("world");
		}
		System.out.println("Time taken by string buffer"+(System.currentTimeMillis()-start));
		
		long start1=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Hello");
		sb1.append("Hello");
		for(int i=0;i<1000;i++) {
			sb1.append("World");
		}
			
		System.out.println("Time taken by String builder"+(System.currentTimeMillis()-start1));
		
	}

}
