package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Vehicle;
import com.xworkz.shopping.things.Vehicle.Car;

public class VehicleRunner {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		System.out.println();
		vehicle.price="3lack";
		System.out.println(vehicle.price);
		vehicle.name="car";
		System.out.println(vehicle.name);
		Car car=vehicle.new Car();
		System.out.println("Inner Class .........");
		car.name="Mahindra Thar";
		car.brand="Hatch";
		car.price="4lack";
		System.out.println(car.name);
		System.out.println(car.brand);
		System.out.println(car.price);
		vehicle.new Car("mahindra","hatch","5lack");
		
	}

}
