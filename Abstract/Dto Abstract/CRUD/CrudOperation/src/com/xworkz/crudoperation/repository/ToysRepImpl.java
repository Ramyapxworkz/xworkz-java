package com.xworkz.crudoperation.repository;

import com.xworkz.crudoperation.dto.ToysDto;

public class ToysRepImpl implements ToysRepo {
   private ToysDto[] dtos=new ToysDto[4];
   private int index=0;
   
	@Override
	public boolean onSave(ToysDto toysDto) {
		if(index<dtos.length) {
			dtos[index]=toysDto;
			index++;
			return true;
		}
		return false;
		
	}

	@Override
	public ToysDto[] read() {
		return dtos;
	}

	@Override
	public boolean update(String name, ToysDto toysDto) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null) {
				if(dtos[i].getName().equalsIgnoreCase(name)) {
					dtos[i]=toysDto;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(String name) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos!=null) {
				if(dtos[i].getName().equals(name)) {
					dtos[i]=null;
					return true;
				}
			}
		}
		return false;
	}
	

}
