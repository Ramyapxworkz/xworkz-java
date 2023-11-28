package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.CrudDouble;


public class CrudDoubleRunner {
	public static void main(String[] args) {
		CrudDouble values = new CrudDouble();
		values.getSave(5.5);
		values.getSave(4.4);
		values.getSave(3.3);
		values.getSave(2.2);
		values.getread();
		values.getUpdate(5.5, 1.1);
		values.getDelete(2.2);
		values.getread();
	}

}
