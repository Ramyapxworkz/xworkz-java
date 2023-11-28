package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.CrudInt;

public class CrudIntRunner {
	public static void main(String[] args) {
		CrudInt values = new CrudInt();
		values.getSave(55);
		values.getSave(44);
		values.getSave(33);
		values.getSave(22);
		values.getread();
		values.getUpdate(55, 11);
		values.getDelete(22);
		values.getread();

	}

}
