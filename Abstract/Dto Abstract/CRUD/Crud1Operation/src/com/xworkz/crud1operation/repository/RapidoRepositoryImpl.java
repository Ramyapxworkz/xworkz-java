package com.xworkz.crud1operation.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.crud1operation.dto.RapidoDto;

public class RapidoRepositoryImpl implements RapidoRepository{
	  List<RapidoDto> listOdDtos=new ArrayList<RapidoDto>();

	@Override
	public boolean onSave(RapidoDto rapidoDto) {
		if(rapidoDto!=null) {
			listOdDtos.add(rapidoDto);
			return true;
		}
		return false;
	}

	@Override
	public List<RapidoDto> readAll() {
		return listOdDtos;
	}

	@Override
	public boolean upDate(String userName, RapidoDto rapidoDto) {
		for(RapidoDto dtos:listOdDtos) {
			
			if(dtos.getUserName().equals(userName)) {
				dtos.setUserName(rapidoDto.getUserName());
				return true;
			}
		}
		return false;
	}

}
