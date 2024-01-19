package com.xworkz.sankrathi.service;

import com.xworkz.sankrathi.dto.SankrathiDto;
import com.xworkz.sankrathi.repository.SankranthiRepo;

public class SankranthiServiceImp implements SankranthiService{
       private SankranthiRepo repository;
       public SankranthiServiceImp(SankranthiRepo repository) {
    	   this.repository=repository;
    
       }
	@Override
	public boolean validateSave(SankrathiDto sankrathiDto) {
		boolean check=validateState(sankrathiDto.getState());
		if(check) {
			boolean exist=isExist(sankrathiDto);
			if(exist!=true) {
				boolean save=repository.onSave(sankrathiDto);
				if(save) {
					System.out.println("Saved Successfully");
					return true;
				}else {
					System.out.println("not saved successfully");
				}
			}
		}
		
		
		
		return false;
	}
	public boolean isExist(SankrathiDto sankrathiDto) {
		SankrathiDto[] list=repository.read();
		if(list!=null) {
			for(SankrathiDto dtos:list) {
				if(dtos!=null) {
					if(dtos.getState().equals(sankrathiDto.getState())) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	public boolean validateState(String state) {
		if(state.isEmpty()) {
			return false;
		}
		if(state.isBlank()) {
			return false;
		}
		return true;
	}
	@Override
	public void read() throws NullPointerException{
		SankrathiDto[] list=repository.read();
		if(list!=null) {
			for(SankrathiDto dto:list) {
				//if(dto!=null) {
					System.out.println(dto);
				//}
			}
		}
		
	}
	@Override
	public void read(String foodName) {
		
		if(foodName!=null) {
			
			SankrathiDto[] list=repository.read();
			for(SankrathiDto dto:list)	{
				if(dto.getFoodName().equals(foodName)) {
					System.out.println(dto);
				}
			}
				
		}
	}
	@Override
	public void readByState(String state) {
		  if(state!=null) {
			  SankrathiDto[] list=repository.read();
			  if(list!=null) {
				  for(SankrathiDto dto:list) {
					  if(dto!=null) {
						  if(dto.getState().equals(state)) {
							  System.out.println(dto);
						  }
					  }else {
						  System.out.println("name is null");
					  }
				  }
			  }
		  }
	}
	@Override
 
	public void readGame(String games) {
		if(games!=null) {
			SankrathiDto[] nameDtos=repository.read();
			if(nameDtos!=null) {
				for(SankrathiDto dto:nameDtos) {
					if(dto.getGames().equalsIgnoreCase(games)) {
						System.out.println(dto);
					}
				}
			}
		}
	
	}
	@Override
	public boolean validateUpdate(String state, SankrathiDto sankrathiDto) {
	if(state!=null) {
		
		SankrathiDto[] nameDtos=repository.read();
		
		if(nameDtos!=null) {
			
			for(SankrathiDto dtos:nameDtos) {
				
					//System.out.println("====");
					boolean checkUpadte=repository.upDate(state, sankrathiDto);
					if(checkUpadte) {
						System.out.println("updated successfully");
						return true;
					}else {
						System.out.println("not updated successfully");
					}
				}
				
			}
		}
	
		return false;
	}
	
	
	
	

}
