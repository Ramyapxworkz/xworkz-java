package com.xworkz.crud1operation.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.crud1operation.dto.HotelDto;
import com.xworkz.crud1operation.dto.RapidoDto;

public class HotelRepositoryImpl implements HotelRepository {
	  List<HotelDto> listOdDtos=new ArrayList<HotelDto>();

	@Override
	public boolean onSave(HotelDto hotelDto) {
		if(hotelDto!=null) {
			listOdDtos.add(hotelDto);
			return true;
		}
		return false;
	}

	@Override
	public List<HotelDto> readAll() {
		return listOdDtos;
	}

	@Override
	public boolean upDate(String hotelName, HotelDto hotelDto) {
for(HotelDto dtos:listOdDtos) {
			
			if(dtos.getHotelName().equals(hotelName)) {
				dtos.setHotelName(hotelDto.getHotelName());
				return true;
			}
		}
		return false;
	}

}
