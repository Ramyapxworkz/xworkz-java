package com.xworkz.crud1operation.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.crud1operation.dto.ConsultancyDto;

public class ConsultancyRepositoryImpl implements ConsultancyRepository{
  List<ConsultancyDto> listOdDtos=new ArrayList<ConsultancyDto>();
	@Override
	public boolean onSave(ConsultancyDto consultancyDto) {
		if(consultancyDto!=null) {
			listOdDtos.add(consultancyDto);
			return true;
		}
		return false;
	}
	@Override
	public List<ConsultancyDto> readAll() {
		return listOdDtos;
	}
	@Override
	public boolean upDate(String name, ConsultancyDto consultancyDto) {
		for(ConsultancyDto dto:listOdDtos) {
			if(dto.getName().equals(name)) {
				dto.setName(consultancyDto.getName());
				return true;
			}
		}
		return false;
	}
	

}
