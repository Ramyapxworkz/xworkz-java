package com.xworkz.september.things;

public class Food {
	public static  void getFoodName() {
		System.out.println("Name of the food is Holige");
	}
	public static void getCalories() {
		System.out.println("150");
	}
	public static void isVegetarian() {
		System.out.println("yes vegetarian");
	}
	public static void isGluten() {
		System.out.println("yes gluten is present");
	}
	public static void getFoodName(String name) {
		System.out.println("Name of the food is :"+name);
	}
	public static void getCalories(int nameOfCalories) {
		System.out.println("calories:"+nameOfCalories);
	}
	public static void isVegetarian(boolean vegetarian) {
		System.out.println("if vegetarian:"+vegetarian);
	}
	public static void isGluten(boolean gluten) {
		System.out.println("Food contains:"+gluten);
	}
	public static String getFoodNames() {
		return "curry";
	}
	public static int getCalorie() {
		return 170;
	}
	public static boolean Vegetarian() {
		return true;
	}
	public static boolean Gluten() {
		return false;
		}
	public static String getFoodNames(String name) {
		
		String nameOfTheFood=name;
		System.out.println(nameOfTheFood);
		return nameOfTheFood;
	}
	public static int getCalorie(int num) {
		int number=num;
		
		System.out.println(number);
		return number;
	}
	public static boolean Vegetarian(boolean value) {
		boolean price=value;
		System.out.println(price);
		return price;
	}
	public static boolean Gluten(boolean present) {
		boolean checkGluten=present;
		System.out.println(checkGluten);
		return checkGluten;
		}
	
	

}
