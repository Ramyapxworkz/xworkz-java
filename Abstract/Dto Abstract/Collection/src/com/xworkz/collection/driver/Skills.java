package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class Skills {
  public static void main(String[] args) {
	List list=new ArrayList();
	list.add("java");
	list.add("SQL");
	list.add("MySQL");
	System.out.println(list);
	//check the object is present or not
	System.out.println(list.contains("SQL"));
	//check the length of the array by using size
	System.out.println(list.size());
	//remove the element by particular array by using remove method
	System.out.println(list.remove(1));
	System.out.println(list);
	
}
}
