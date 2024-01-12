package com.xworkz.sankrathi.runner;

import java.util.Date;

import com.xworkz.sankrathi.dto.SankrathiDto;
import com.xworkz.sankrathi.repository.SankranthiRepo;
import com.xworkz.sankrathi.repository.SankranthiRepoImp;
import com.xworkz.sankrathi.service.SankranthiService;
import com.xworkz.sankrathi.service.SankranthiServiceImp;

public class SankranthiRunner {
  public static void main(String[] args) {
	  SankrathiDto dto=new SankrathiDto();
	  dto.setFoodName("Sweet");
	  dto.setSpecialThings("sugar cane");
	  dto.setState("karnataka");
	  dto.setTypeOfFestival("Sankranthi");
	  dto.setDay(new Date());
	  dto.setGames("indore games");
	  System.out.println(dto.toString());
	  
	  SankranthiRepo repo=new SankranthiRepoImp();
	  SankranthiService service=new SankranthiServiceImp(repo);
	  SankrathiDto dto1=new SankrathiDto();
	  dto1.setFoodName("Biriyani");
	  dto1.setSpecialThings("sugar cane");
	  dto1.setState("MP");
	  dto1.setTypeOfFestival("Sankranthi");
	  dto1.setDay(new Date());
	  dto1.setGames("Chess");
	  System.out.println(dto1.toString());
	  
	  SankrathiDto dto2=new SankrathiDto();
	  dto2.setFoodName("Holige");
	  dto2.setSpecialThings("sugar cane");
	  dto2.setState("AP");
	  dto2.setTypeOfFestival("Sankranthi");
	  dto2.setDay(new Date());
	  dto2.setGames("carrom");
	  System.out.println(dto2.toString());
	  
	  SankrathiDto dto3=new SankrathiDto();
	  dto3.setFoodName("Payasa");
	  dto3.setSpecialThings("sugar cane");
	  dto3.setState("Rajasthan");
	  dto3.setTypeOfFestival("Sankranthi");
	  dto3.setDay(new Date());
	  dto3.setGames("snake and ladder");
	  System.out.println(dto3.toString());
	  
	  SankrathiDto dto4=new SankrathiDto();
	  dto4.setFoodName("ellu");
	  dto4.setSpecialThings("sugar cane");
	  dto4.setState("Goa");
	  dto4.setTypeOfFestival("Sankranthi");
	  dto4.setDay(new Date());
	  dto4.setGames("ludo");
	  System.out.println(dto4.toString());
	  service.validateSave(dto);
	  service.validateSave(dto1);
	  service.validateSave(dto2);
	  service.validateSave(dto3);
	  service.validateSave(dto4);
	  service.read();
	  System.out.println("read by food Name");
	  service.read("Holige");
	  System.out.println("read by state");
	  service.readByState("Rajasthan");
	  System.out.println("read games");
	  service.readGame("ludo");
	  System.out.println("Update========================");
	  SankrathiDto dto5=new SankrathiDto();
	  dto5.setState("kerala");
	  service.validateUpdate("Rajasthan", dto5);
	  service.read();
	  System.out.println("delete==============================");
	  repo.delete("Goa");
	  service.read();
	  
	  
	  
	
	  
	  
	  
	  
}
}
