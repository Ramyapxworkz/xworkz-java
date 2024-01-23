package com.xworkz.crud1operation.runner;

import com.xworkz.crud1operation.dto.BarDto;
import com.xworkz.crud1operation.repository.BarRepository;
import com.xworkz.crud1operation.repository.BarRepositoryImpl;
import com.xworkz.crud1operation.service.BarService;
import com.xworkz.crud1operation.service.BarServiceImpl;

public class BarRunner {
	public static void main(String[] args) {
		BarDto dto=new BarDto();
		dto.setName("SJR");
		dto.setPlace("Bangalore");
		dto.setContactNumber(9876543212l);
		dto.setRating(3.8f);
		System.out.println(dto.toString());
		
		BarRepository repo=new BarRepositoryImpl();
		BarService service=new BarServiceImpl(repo);
		service.validateAndSave(dto);
		BarDto dto1=new BarDto();
        dto1.setName("Bar");
		service.validateAndSave(dto1);

		service.readAll();
		System.out.println("update====================");
		service.update("SJR", dto1);
		service.readAll();
		
	}
}
