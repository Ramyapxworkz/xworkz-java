package com.xworkz.crudoperation.service;

import com.xworkz.crudoperation.dto.ToysDto;
import com.xworkz.crudoperation.exception.AlphabetException;
import com.xworkz.crudoperation.exception.ColorException;
import com.xworkz.crudoperation.exception.PriceException;
import com.xworkz.crudoperation.repository.ToysRepo;

public class ToysServiceImpl implements ToysService{
    private ToysRepo repository;
    public ToysServiceImpl(ToysRepo repository) {
    	this.repository=repository;
    }
	@Override
	public boolean validateAndSave(ToysDto toysDto) throws AlphabetException, PriceException, ColorException {
		boolean check=validateName(toysDto.getName());
		boolean checkPrice=validatePrice(toysDto.getPrice());
		boolean checkColor=validateColor(toysDto.getColor());
		
		if(check&&checkPrice){
			boolean exist=isExist(toysDto);
			if(exist!=true) {
				boolean save=repository.onSave(toysDto);
				if(save) {
					System.out.println("saved successfully");
					return true;
				}else {
					System.out.println("saved successfully");
				}
			}
			
		}
		
		return false;
	}

	@Override
	public boolean read() {
		ToysDto[] dtos=repository.read();
		if(dtos!=null) {
			for(ToysDto dto:dtos) {
//				if(dto!=null) {
					System.out.println(dto);
//				}
			}
		}
		return false;
	}
    public boolean isExist(ToysDto toysDto) {
    	ToysDto[] list=repository.read();
    	if(list!=null) {
    		for(ToysDto dto:list) {
    			if(dto!=null) {
    				if(dto.getName().equalsIgnoreCase(toysDto.getName())) {
    					return true;
    				}
    			}
    		}
    	}
		return false;
    	
    }
    public boolean validateName(String name) throws AlphabetException {
    	if(!(Character.isUpperCase(name.charAt(0)))) {
    		throw new AlphabetException("First letter in the name should be capital ");
    	}
    	return true;
    }
    
    public boolean validatePrice(int price) throws PriceException {
    	if(!(price>100&&price<500)) {
    		throw new PriceException("Price should be greter than 100 and less than 500");
    		
    	}
    	return true;
    }
    
    public boolean validateColor(String color) throws ColorException {
    	if(!(color.equals("pink")||color.equals("Black")||color.equals("Brown"))) {
    		throw new ColorException("Color should be Pink,Black,Brown");
    		
    	}
    	return true;
    }
	@Override
	public boolean update(String name, ToysDto toysDto) {
		ToysDto[] list=repository.read();
		if(list!=null) {
			boolean checkUpdate=repository.update(name, toysDto);
			if(checkUpdate) {
				System.out.println("Updated successfully");
				return true;
			}else {
				System.out.println("Updated not SuccessFully");
			}
		}
		return false;
	}
    
    
    
    
}
