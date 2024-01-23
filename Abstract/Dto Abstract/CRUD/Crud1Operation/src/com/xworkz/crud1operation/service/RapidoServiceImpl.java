package com.xworkz.crud1operation.service;

import java.util.List;

import com.xworkz.crud1operation.dto.RapidoDto;
import com.xworkz.crud1operation.repository.RapidoRepository;

public class RapidoServiceImpl implements RapidoService{
	private RapidoRepository repository;
	 public RapidoServiceImpl(RapidoRepository repository) {
		 this.repository=repository;
	 }
	
	
	@Override
	public boolean validateAndSave(RapidoDto rapidoDto) {
		if(rapidoDto!=null) {
			boolean exist=isExist(rapidoDto);
			if(exist!=true) {
	       if(repository.onSave(rapidoDto)) {
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
		 List<RapidoDto> dto=repository.readAll();
	     System.out.println(dto);
	}

	@Override
	public boolean update(String useName, RapidoDto rapidoDto) {
		boolean update=repository.upDate(useName, rapidoDto);
		if(update) {
			System.out.println("updated successfully");
			return true;
		}else {
			System.out.println("not updated successfully");
		}
		return false;
	}
	
	
	public boolean isExist(RapidoDto rapidoDto) {
		 List<RapidoDto> dto=repository.readAll();
		 if(dto.contains(rapidoDto)) {
			 return true;
		 }
		return false;
	}

}
