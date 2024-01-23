package com.xworkz.crud1operation.service;

import java.util.List;

import com.xworkz.crud1operation.dto.HotelDto;
import com.xworkz.crud1operation.repository.HotelRepository;

public class HotelServiceImpl implements HotelService{
	private HotelRepository repository;
	 public HotelServiceImpl(HotelRepository repository) {
		 this.repository=repository;
	 }
	@Override
	public boolean validateAndSave(HotelDto hotelDto) {
		if(hotelDto!=null) {
			boolean exist=isExist(hotelDto);
			if(exist!=true) {
	       if(repository.onSave(hotelDto)) {
	    	   System.out.println("Saved successfully");
	    	   return true;
	       }else {
	    	   System.out.println("not saved successfully");
	       }
		}else {
			System.out.println("dto is already exist");
		}
			
		}else {
			System.out.println("It is Null");
		}
	
		return false;
	}

	@Override
	public void readAll() {
		List<HotelDto> dto=repository.readAll();
	     System.out.println(dto);		
	}

	@Override
	public boolean update(String hotelName, HotelDto hotelDto) {
		boolean update=repository.upDate(hotelName, hotelDto);
		if(update) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated successfully");
		}
		return false;
	}
	
	public boolean isExist(HotelDto hotelDto) {
		 List<HotelDto> dto=repository.readAll();
		 if(dto.contains(hotelDto)) {
			 return true;
		 }
		return false;
	}

}
