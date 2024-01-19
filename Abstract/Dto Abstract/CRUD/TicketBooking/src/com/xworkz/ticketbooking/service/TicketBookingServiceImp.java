package com.xworkz.ticketbooking.service;

import com.xowrkz.ticketbooking.exception.NameLengthException;
import com.xowrkz.ticketbooking.exception.TicketPriceException;
import com.xworkz.ticketbooking.dto.TicketBookingDto;
import com.xworkz.ticketbooking.repository.TicketBookingRepo;

public class TicketBookingServiceImp implements TicketBookingService{
     private TicketBookingRepo repository;
     public TicketBookingServiceImp(TicketBookingRepo repository) {
    	 this.repository=repository;
     }
	@Override
	public boolean validateandSave(TicketBookingDto ticketBookingDto) throws NameLengthException, TicketPriceException  {
		boolean check=validateName(ticketBookingDto.getName());
		boolean checkFrom=validateName(ticketBookingDto.getForm());
		boolean checkprice=validatevalue(ticketBookingDto.getTicketPrice());
		if(check&&checkFrom&&checkprice) {
			boolean exist=isExsit(ticketBookingDto);
			if(exist) {
				boolean save=repository.onSave(ticketBookingDto);
				if(save) {
					System.out.println("dto saved successfully");
					return true;
				}else {
					System.out.println("dto not saved successfully");
				}
				
			}
		}
		
		
		
		return false;
	}
	public boolean isExsit(TicketBookingDto ticketBookingDto) {
		
			TicketBookingDto[] list=repository.read();
		if(list!=null) {
			for(TicketBookingDto dto:list) {
				if(dto!=null) {
					if(dto.getEmail().equals(ticketBookingDto.getEmail())) {
						return true;
					}
				}
			
		}}
		return false;
	}
	
	
	public boolean validateName(String name) throws NameLengthException {
		if(name.length()>3&&name.length()<30) {
			throw new NameLengthException("name shoud be >3 and <30");
		}
		return true;
	}
	
	public boolean validatevalue(int ticketPrice) throws TicketPriceException  {
		if(ticketPrice>100&&ticketPrice<500) {
			throw new TicketPriceException("price should be greater than 100 and less than 500");
		}
		return true;
	}
	@Override
	public void read() {
		TicketBookingDto[] list=repository.read();
		if(list!=null) {
			for(TicketBookingDto dto:list) {
				if(dto!=null) {
					System.out.println(dto);
				}
			}
		}
	}

}
