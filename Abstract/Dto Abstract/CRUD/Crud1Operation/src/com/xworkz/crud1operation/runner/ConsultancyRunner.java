package com.xworkz.crud1operation.runner;

import com.xworkz.crud1operation.dto.ConsultancyDto;
import com.xworkz.crud1operation.repository.ConsultancyRepository;
import com.xworkz.crud1operation.repository.ConsultancyRepositoryImpl;
import com.xworkz.crud1operation.service.ConsultancyService;
import com.xworkz.crud1operation.service.ConsultancyServiceImpl;

public class ConsultancyRunner {
	public static void main(String[] args) {
		ConsultancyDto dto=new ConsultancyDto();
		dto.setUrl("jdbc:mysql://localhost:3306/mydatabase\"");
		dto.setId(1);
		dto.setName("Pramod");
		dto.setContactNumber(9123456781l);
		System.out.println(dto.toString());
		ConsultancyRepository repo=new ConsultancyRepositoryImpl();
		ConsultancyService service=new ConsultancyServiceImpl(repo);
		service.validateAndSave(dto);
		ConsultancyDto dto1=new ConsultancyDto();
        dto1.setName("Nikil");
		service.validateAndSave(dto1);

		service.readAll();
		System.out.println("update====================");
		service.update("Pramod", dto1);
		service.readAll();
		
	}

}
