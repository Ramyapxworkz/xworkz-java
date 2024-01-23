package com.xworkz.crud1operation.runner;

import com.xworkz.crud1operation.dto.RapidoDto;
import com.xworkz.crud1operation.repository.RapidoRepository;
import com.xworkz.crud1operation.repository.RapidoRepositoryImpl;
import com.xworkz.crud1operation.service.ConsultancyService;
import com.xworkz.crud1operation.service.ConsultancyServiceImpl;
import com.xworkz.crud1operation.service.RapidoService;
import com.xworkz.crud1operation.service.RapidoServiceImpl;

public class RapidoRunner {
	public static void main(String[] args) {
		RapidoDto dto=new RapidoDto();
		dto.setUserName("Ramya");
		dto.setContactNumber("6366276883");
		dto.setFrom("RajajiNagr");
		dto.setTo("Navarang");
		System.out.println(dto.toString());
		
		RapidoRepository repo=new RapidoRepositoryImpl();
		RapidoService service=new RapidoServiceImpl(repo);
		service.validateAndSave(dto);
		RapidoDto dto1=new RapidoDto();
        dto1.setUserName("Nikil");
		service.validateAndSave(dto1);

		service.readAll();
		System.out.println("update====================");
		service.update("Ramya", dto1);
		service.readAll();
		
	}
}
