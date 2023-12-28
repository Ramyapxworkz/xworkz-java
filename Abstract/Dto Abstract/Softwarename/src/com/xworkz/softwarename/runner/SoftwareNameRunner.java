package com.xworkz.softwarename.runner;

import com.xworkz.softwarename.repository.SoftwareNameRepo;
import com.xworkz.softwarename.repository.SoftwareNameRepoImp;
import com.xworkz.softwarename.service.SoftwareNameService;
import com.xworkz.softwarename.service.SoftwareNameServiceImp;

public class SoftwareNameRunner {
	public static void main(String[] args) {
		SoftwareNameRepo repo=new SoftwareNameRepoImp();
		SoftwareNameService service=new SoftwareNameServiceImp(repo);
		service.validateSave("TechNest");
		service.validateSave("Legal Clip");
		service.validateSave("Finance Now");
		service.validateSave("SoftoMatic");
		service.validateSave("UpaTree");
		repo.read();
		service.validateUpdate("UpaTree", "oracle");
		repo.read();
		

		

		
		
	}

}
