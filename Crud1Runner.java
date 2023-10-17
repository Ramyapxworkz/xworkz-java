package com.xworkz.september.driver;

import com.xworkz.september.things.Crud1;

public class Crud1Runner {
	public static void main(String[] args) {
		Crud1 crud1=new Crud1();
		crud1.getSave("Thunder Strike");
		crud1.getSave("Rising Stars");
		crud1.getSave("Royal Challengers");
		crud1.getSave("Power Hitter");
		crud1.getSave("Dynamic duo");
		crud1.getSave("Flying eagles");
		crud1.getRead();
		crud1.getUpdate("Power Hitter", "Rebel Raiders");
		crud1.getRead();
		crud1.getDelete("Dynamic duo");
		crud1.getRead();
	}

}
