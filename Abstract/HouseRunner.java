package com.xworkz.house;

import com.xworkz.house.abstractimp.House;
import com.xworkz.house.runner.MyHouse;

public class HouseRunner {
	public static void main(String[] args) {
		House h=new MyHouse();
		h.openDoor();
		h.lockHouse();
		h.turnOnLights();
	}

}
