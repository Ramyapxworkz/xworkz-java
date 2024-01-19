package com.xworkz.crudoperation.service;

import com.xworkz.crudoperation.dto.BlanketDto;
import com.xworkz.crudoperation.exception.PriceException;
import com.xworkz.crudoperation.repository.BlanketRepo;

public class BlanketServiceImpl implements BlanketService{
     private BlanketRepo repository;
     public BlanketServiceImpl(BlanketRepo repository) {
    	 this.repository=repository;
     }
	@Override
	public boolean validateandSave(BlanketDto blanketDto) throws PriceException {
		if(blanketDto!=null) {
		boolean checkName=validateName(blanketDto.getBlanketName());
		boolean checkPrice=validatePrice(blanketDto.getBlacketsPrice());
		if(checkName&&checkPrice) {
			boolean exist=isExist(blanketDto);
			if(exist!=true) {
				boolean save=repository.onSave(blanketDto);
				if(save) {
					System.out.println("saved successfully");
					return true;
				}else {
					System.out.println("not saved successfully");
				}
			}
		}
		}
		return false;
	}
	

	@Override
	public void read() {
		BlanketDto[] dtos=repository.read();
		if(dtos!=null) {
			for(BlanketDto dto:dtos) {
			
				System.out.println(dto);
			
			}
		}
	}
	
	public boolean isExist(BlanketDto blanketDto) {
		try {
		BlanketDto[] dtos=repository.read();
		if(dtos!=null) {
			for(BlanketDto dto:dtos) {
				
				if(dto!=null&&dto.getBlanketName().equals(dto.getBlanketName())) {
					return true;
				}
			}
		}}catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		return false;
	}
	
	
	
	public boolean validateName(String blanketName) {
		if(!(Character.isUpperCase(blanketName.charAt(0)))) {
			return false;
		}
		
		return true;
	}
	public boolean validatePrice(int blacketsPrice) throws PriceException {
		if(!(blacketsPrice>100&&blacketsPrice<500)) {
			throw new PriceException("it should be greater than 100 and less than 500");
		}
		return true;
	}

}
