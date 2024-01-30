package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CompanyNames {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Google");
		list.add("Apple");
		list.add("Microsoft");
		list.add("Amazon");
		list.add("FaceBook");
		list.add("Tesla");
		System.out.println(list);
		list.add(2, "Amazon");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.contains("FaceBook"));
		System.out.println(list.indexOf("Tesla"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.set(1, "Quest global");
		System.out.println(list);
		
		System.out.println(list.remove(4));
		System.out.println(list.subList(2, 4));
		System.out.println(list.stream());
         
		
		
	}

}
