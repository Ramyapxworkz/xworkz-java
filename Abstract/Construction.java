package com.xworkz.building.runner;

import com.xworkz.building.abstractsImpliments.Building;

public class Construction extends Building {

	@Override
	public void getInformation() {
		System.out.println("get informaion");
		
	}

	@Override
	public void getInformation2() {
		System.out.println("get information ");
		
	}

	@Override
	public String method(String startdate) {
		// TODO Auto-generated method stub
		return "2022/5/23";
	}

	@Override
	public String method1(int cost) {
		// TODO Auto-generated method stub
		return "Total cost:"+cost;
	}
	
	

}
