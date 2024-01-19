package com.xworkz.blinkit.service;

import com.xworkz.blinkit.dto.BlinkItDto;
import com.xworkz.blinkit.repo.BlinkItRepo;

public class BlinkItServiceImpl implements BlinkItService {
       private BlinkItRepo repository;
       public BlinkItServiceImpl(BlinkItRepo repository) {
    	   this.repository=repository;
       }
	@Override
	public boolean validateAndSave(BlinkItDto blinkItDto) {
		System.out.println("invoking validateANdSave");
		 
		
		boolean exist=isExist(blinkItDto);
		if(exist!=true) {
			boolean save=repository.save(blinkItDto);
			if(save) {
				System.out.println("saved successfully");
				return true;
			}else {
				System.out.println("not saved successfully");
			}
		}
		
		
		
		return false;
	}

	
	
	 private boolean isExist(BlinkItDto blinkItDto) {
		   if(blinkItDto!=null) {
			   BlinkItDto[] dto= repository.read();
			   if(dto!=null) {
				   for(BlinkItDto dtos:dto) {
					   if(dtos!=null) {
						   if(dtos.getCustomerName().equalsIgnoreCase(blinkItDto.getCustomerName())) {
							   return true;
						   }
						   if(dtos.getContactNo()==blinkItDto.getContactNo()) {
							   return true;
						   }
						   if(dtos.getNameOfItems().equalsIgnoreCase(blinkItDto.getNameOfItems())) {
							   return true;
						   }
							   
					   }
				   }
			   }
		   }
		 return false;
	 }
	@Override
	public void read() {
		BlinkItDto[] dto=repository.read();
		if(dto!=null) {
			for(BlinkItDto dtos:dto) {
				System.out.println(dtos);
			}
		}
	}
	@Override
	public boolean totalCost(BlinkItDto blinkItDto) {
		        if (blinkItDto != null) {
		            double costPerItem = blinkItDto.getCost();
		            int quantity = blinkItDto.getQuantity();
		            double totalCost = costPerItem * quantity;

		            if(totalCost>=300) {
		            	System.out.println("Value is greater that 300:"+totalCost);
		            	return true;
		            }else {
		            	System.out.println("value is not greater 300");
		            }
//		            System.out.println("Total Cost: " + totalCost);
//		            return true; 
		            
		        } else {
		            System.out.println("Invalid input for calculating total cost");
		        }
		        
		       
	            return false;

	}
	@Override
	public boolean update(String email, BlinkItDto blinkItDto) {
		BlinkItDto[] dto= repository.read();
		if(dto!=null) {
			boolean update=repository.update(email, blinkItDto);
			if(update) {
				System.out.println("updated successfully.................................................................");
				return true;
			}else{
				System.err.println("Not updated");
			}
		}
		return false;
	}

	

}
