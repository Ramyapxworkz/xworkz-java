package com.xworkz.googleapps.runner;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsREepositoryImplementation;
import com.xworkz.googleapps.repository.GoogleAppsRepository;
import com.xworkz.googleapps.service.GoogleAppsService;
import com.xworkz.googleapps.service.GoogleAppsServiceImplementation;

public class GoogleAppsRunner {
	public static void main(String[] args) {
		GoogleAppsDto dtos=new GoogleAppsDto();
		dtos.setApplicationId("G001");
		dtos.setApplicationName("Gmail");
		dtos.setApplicationVersion("g12V");
		dtos.setApplicationCost(0);
		dtos.setApplicationStorage(15);
		System.out.println(dtos.toString());
		GoogleAppsDto dtos1=new GoogleAppsDto();
		dtos1.setApplicationId("G002");
		dtos1.setApplicationName("Google drive");
		dtos1.setApplicationVersion("googlV");
		dtos1.setApplicationCost(0);
		dtos1.setApplicationStorage(15);
		
		System.out.println(dtos1.toString());
		GoogleAppsDto dtos2=new GoogleAppsDto();
		dtos2.setApplicationId("G003");
		dtos2.setApplicationName("Google Photos");
		dtos2.setApplicationVersion("Google PhotosV");
		dtos2.setApplicationCost(0);
		dtos2.setApplicationStorage(15);
		System.out.println(dtos2.toString());
		GoogleAppsDto dtos3=new GoogleAppsDto();
		dtos3.setApplicationId("G004");
		dtos3.setApplicationName("Google Pay");
		dtos3.setApplicationVersion("Google PayV");
		dtos3.setApplicationCost(0);
		dtos3.setApplicationStorage(15);
		System.out.println(dtos3.toString());
		
		
		
		GoogleAppsRepository repo=new GoogleAppsREepositoryImplementation();
		GoogleAppsService service=new GoogleAppsServiceImplementation(repo);
		service.validateSave(dtos);
		service.validateSave(dtos1);
		service.validateSave(dtos2);
		service.validateSave(dtos3);
	
		
		service.read();
		
		
	}

}
