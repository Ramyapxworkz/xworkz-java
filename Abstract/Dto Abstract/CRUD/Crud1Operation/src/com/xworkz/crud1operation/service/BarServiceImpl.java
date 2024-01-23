package com.xworkz.crud1operation.service;

import java.util.List;

import com.xworkz.crud1operation.dto.BarDto;
import com.xworkz.crud1operation.repository.BarRepository;

public class BarServiceImpl implements BarService {
	private BarRepository repository;
	 public BarServiceImpl(BarRepository repository) {
		 this.repository=repository;
	 }
	
	@Override
	public boolean validateAndSave(BarDto barDto) {
		if(barDto!=null) {
			boolean exist=isExist(barDto);
			if(exist!=true) {
	       if(repository.onSave(barDto)) {
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
		 List<BarDto> dto=repository.readAll();
	     System.out.println(dto);
	}

	@Override
	public boolean update(String name, BarDto barDto) {
		boolean update=repository.upDate(name, barDto);
		if(update) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated successfully");
		}
		return false;
	}
	
	
	public boolean isExist(BarDto barDto) {
		 List<BarDto> dto=repository.readAll();
		 if(dto.contains(barDto)) {
			 return true;
		 }
		return false;
	}

}
