package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodNames {
  public static void main(String[] args) {
	List list=new ArrayList();
	Collections.addAll(list,"Arepa","Asparagus","Onion rings","Salad","Sandwich","Bread","Steak","Tuna Steak",
			"Fish","Shrimp","Rice","Spaghetti","Pizza","Hamburger","Eggs","Cheese","Sausages","Milk",
			"Candy","Cookie","Pie","Cake","Cupcake","Salty","Spicy","Sweet","Sour","Acid","Bitter","Payasa");
	System.out.println(list);
	System.out.println("Size of the list is:"+list.size());
	System.out.println("Find object present in that list:"+list.contains("Pizza"));
	System.out.println(list.remove(17));
	
	System.out.println(list.containsAll(list));
	
	
}
}
