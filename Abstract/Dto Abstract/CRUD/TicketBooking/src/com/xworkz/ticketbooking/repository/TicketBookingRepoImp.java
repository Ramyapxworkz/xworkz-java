package com.xworkz.ticketbooking.repository;

import com.xworkz.ticketbooking.dto.TicketBookingDto;

public class TicketBookingRepoImp implements TicketBookingRepo{
        private TicketBookingDto[] list=new TicketBookingDto[4];
        private int index=0;
        
	@Override
	public boolean onSave(TicketBookingDto ticketBookingDto) {
		if(index<list.length) {
			list[index]=ticketBookingDto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public TicketBookingDto[] read() {
		return list;
	}
	

}
