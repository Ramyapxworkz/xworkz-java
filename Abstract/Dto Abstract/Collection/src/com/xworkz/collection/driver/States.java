package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class States {
	public static void main(String[] args) {
		List stateList=new ArrayList();
		Collections.addAll(stateList,"Andhra Pradesh", "Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa",
				"Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur",
				"Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");
		System.out.println("Total num of states:"+stateList.size());
		System.out.println("Check Karnataka Present or not:"+stateList.contains("Karnataka"));
		//System.out.println("Removed Tamil Nadu:"+stateList.remove(0));
		
		System.out.println("Remove Tamil Nadu"+stateList.remove("Tamil Nadu"));
		
	}

}
