package com.xworkz.crud1operation.runner;

import com.xworkz.crud1operation.dto.HotelDto;
import com.xworkz.crud1operation.repository.HotelRepository;
import com.xworkz.crud1operation.repository.HotelRepositoryImpl;
import com.xworkz.crud1operation.service.HotelService;
import com.xworkz.crud1operation.service.HotelServiceImpl;

public class HotelRunner {
	public static void main(String[] args) {
		HotelDto dto=new HotelDto();
		dto.setHotelName("SJR");
		dto.setPlace("Bangalore");
		dto.setRating(3.4f);
		dto.setType(true);
		dto.setContactNumber(9876543212l);
		
		System.out.println(dto.toString());
		
		HotelRepository repo=new HotelRepositoryImpl();
		HotelService service=new HotelServiceImpl(repo);
		service.validateAndSave(dto);
		HotelDto dto1=new HotelDto();
        dto1.setHotelName("Sanman");
		service.validateAndSave(dto1);

		service.readAll();
		System.out.println("update====================");
		service.update("SJR", dto1);
		service.readAll();
		
	}

}
