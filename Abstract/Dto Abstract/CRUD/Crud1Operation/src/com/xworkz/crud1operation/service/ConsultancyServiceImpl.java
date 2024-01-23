package com.xworkz.crud1operation.service;

import java.util.List;

import com.xworkz.crud1operation.dto.ConsultancyDto;
import com.xworkz.crud1operation.repository.ConsultancyRepository;

public class ConsultancyServiceImpl implements ConsultancyService {
 private ConsultancyRepository repository;
 public ConsultancyServiceImpl(ConsultancyRepository repository) {
	 this.repository=repository;
 }
	@Override
	public boolean validateAndSave(ConsultancyDto consultancyDto) {
		if(consultancyDto!=null) {
			boolean exist=isExist(consultancyDto);
			if(exist!=true) {
	       if(repository.onSave(consultancyDto)) {
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
     List<ConsultancyDto> dto=repository.readAll();
     System.out.println(dto);
	}
	
	public boolean isExist(ConsultancyDto consultancyDto) {
		 List<ConsultancyDto> dto=repository.readAll();
		 if(dto.contains(consultancyDto)) {
			 return true;
		 }
		return false;
	}
	@Override
	public boolean update(String name, ConsultancyDto consultancyDto) {
		boolean update=repository.upDate(name, consultancyDto);
		if(update) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated successfully");
		}
		return false;
	}

}
