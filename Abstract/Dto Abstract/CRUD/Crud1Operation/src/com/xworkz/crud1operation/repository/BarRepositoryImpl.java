package com.xworkz.crud1operation.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.crud1operation.dto.BarDto;

public class BarRepositoryImpl implements BarRepository {
	  List<BarDto> listOdDtos=new ArrayList<BarDto>();

	@Override
	public boolean onSave(BarDto barDto) {
		if(barDto!=null) {
			listOdDtos.add(barDto);
			return true;
		}
		return false;
	}

	@Override
	public List<BarDto> readAll() {
		
		return listOdDtos;
	}

	@Override
	public boolean upDate(String name, BarDto barDto) {
          for(BarDto dtos:listOdDtos) {
			
			if(dtos.getName().equals(name)) {
				dtos.setName(barDto.getName());
				return true;
			}
		}
		return false;
	}
	

}
