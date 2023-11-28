package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.CrudChar;

public class CrudCharrunner {
	public static void main(String[] args) {
		CrudChar c=new CrudChar();
		c.getSave('A');
		c.getSave('B');
		c.getSave('C');
		c.getSave('D');
		c.getread();

		c.getUpdate('C', 'F');
		c.getDelete('D');
		c.getread();
		
		

	}

}
