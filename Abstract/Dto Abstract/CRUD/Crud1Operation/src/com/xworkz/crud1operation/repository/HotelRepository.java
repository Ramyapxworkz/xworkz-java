package com.xworkz.crud1operation.repository;

import java.util.List;

import com.xworkz.crud1operation.dto.HotelDto;


public interface HotelRepository {
	boolean onSave(HotelDto hotelDto);
	List<HotelDto> readAll();
	boolean upDate(String hotelName,HotelDto hotelDto);
	

}
