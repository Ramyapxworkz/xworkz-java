package com.xworkz.crud1operation.service;

import com.xworkz.crud1operation.dto.HotelDto;

public interface HotelService {
	

	boolean validateAndSave(HotelDto hotelDto);
    void readAll();
    boolean update(String hotelName,HotelDto hotelDto);
}
