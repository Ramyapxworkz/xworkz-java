package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;

public class CollegeName {
	public static void main(String[] args) {
		Collection collection=new ArrayList();
		collection.add("JNNCE");
		collection.add("PESET");
		collection.add("RV");
		collection.add("CIT");
		collection.add("GMIT");
		collection.add("BIT");
		System.out.println(collection);
		
		System.out.println(collection.contains("RV"));
		
		System.out.println(collection.remove("GMIT"));
		
		System.out.println(collection.size());
		
		collection.forEach(s->System.out.println(s));
		
		System.out.println("====:"+collection.retainAll(collection));
		
		System.out.println(collection.iterator());
		
		System.out.println(collection.removeAll(collection));
		
        
	}

}
