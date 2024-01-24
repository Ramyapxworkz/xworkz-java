package com.xworkz.practice.driver;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTask {
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		collection.add("Ramya");
		collection.add("Varun");
		collection.add("Amma");
		collection.add("Appa");
        System.out.println("List of collection:"+collection);     
//		collection.addAll(collection);
		System.out.println(collection.contains("Amma"));
		System.out.println(collection.equals("Varun"));
		System.out.println(collection);
		System.out.println(collection.hashCode());
		System.out.println(collection.remove("Ramya"));
		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println(collection.iterator());
		System.out.println(collection.parallelStream());
		System.out.println(collection.spliterator());
		System.out.println(collection.stream());
		
		
		
	}

}
