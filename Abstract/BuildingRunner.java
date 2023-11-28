package com.xworkz.building;

import com.xworkz.building.abstractsImpliments.Building;
import com.xworkz.building.runner.Construction;

public class BuildingRunner {
	public static void main(String[] args) {
		Building b=new Construction();
		b.getInformation();
		b.getInformation2();
		System.out.println(b.method("2022/2/23"));
		System.out.println(b.method1(1200000));
	}

}
