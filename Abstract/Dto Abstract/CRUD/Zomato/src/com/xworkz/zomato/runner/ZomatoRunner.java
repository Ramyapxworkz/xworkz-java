package com.xworkz.zomato.runner;

import com.xworkz.zomato.constants.FoodName;
import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepository;
import com.xworkz.zomato.repository.ZomatoRepositoryImp;
import com.xworkz.zomato.service.ZomatoService;
import com.xworkz.zomato.service.ZomatoServiceImp;

public class ZomatoRunner {
	public static void main(String[] args) {
		ZomatoDto dto=new ZomatoDto();
		dto.setCustomerName("Pavan");
		dto.setEmail("Pavan22@gmail.com");
		dto.setNumber(1234567881);
		dto.setCost(101);
		dto.setFoodName(FoodName.DOSA.toString());
		System.out.println(dto.toString());
		ZomatoRepository repo=new ZomatoRepositoryImp();
		ZomatoService service=new ZomatoServiceImp(repo);
		
		ZomatoDto dto1=new ZomatoDto();
		dto1.setCustomerName("pavan1");
		dto1.setEmail("Pavan12@gmail.com");
		dto1.setNumber(1234537891);
		dto1.setCost(102);
		dto1.setFoodName(FoodName.DOSA.toString());
		
		System.out.println(dto1.toString());
		ZomatoDto dto2=new ZomatoDto();
		dto2.setCustomerName("Pavan2");
		dto2.setEmail("Pavan32@gmail.com");
		dto2.setNumber(1233567891);
		dto2.setCost(103);
		dto2.setFoodName(FoodName.DOSA.toString());
		System.out.println(dto2.toString());
		
		ZomatoDto dto3=new ZomatoDto();
		dto3.setCustomerName("Pavan3");
		dto3.setEmail("Pavan62@gmail.com");
		dto3.setNumber(1234367891);
		dto3.setCost(104);
		dto3.setFoodName(FoodName.DOSA.toString());
		System.out.println(dto3.toString());
		service.validateOnsave(dto);
		service.validateOnsave(dto1);
		service.validateOnsave(dto2);
		service.validateOnsave(dto3);
		service.read();
		System.out.println("Update====");
		
		ZomatoDto dto4=new ZomatoDto();
		dto4.setEmail("Ramya@gmai.com");
		service.validateUpdate("Pavan62@gmail.com", dto4);
		service.read();
		
		System.out.println("delete======");
		repo.delete("Pavan62@gmail.com");
		service.read();
		System.out.println("=======");
		repo.contactDelete(1234537891);
		service.read();
		
	}

}
