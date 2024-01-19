package com.xowrkz.ticketbooking.runner;

import com.xowrkz.ticketbooking.exception.NameLengthException;
import com.xowrkz.ticketbooking.exception.TicketPriceException;
import com.xworkz.ticketbooking.dto.TicketBookingDto;
import com.xworkz.ticketbooking.repository.TicketBookingRepo;
import com.xworkz.ticketbooking.repository.TicketBookingRepoImp;
import com.xworkz.ticketbooking.service.TicketBookingService;
import com.xworkz.ticketbooking.service.TicketBookingServiceImp;

public class TicketBookingRunner {
	public static void main(String[] args) throws NameLengthException,TicketPriceException {
		TicketBookingDto dto=new TicketBookingDto();
		dto.setName("Ra");
		dto.setEmail("rramyap920@gamil.com");
		dto.setTicketPrice(1000);
		dto.setForm("Davangere");
		dto.setTo("mysore");
		System.out.println(dto.toString());
		TicketBookingRepo repo=new TicketBookingRepoImp();
		TicketBookingService service=new TicketBookingServiceImp(repo);
		TicketBookingDto dto1=new TicketBookingDto();
		dto1.setName("Ra");
		dto1.setEmail("rramyap920@gamil.com");
		dto1.setTicketPrice(7000);
		dto1.setForm("Davangere");
		dto1.setTo("mysore");
		System.out.println(dto1.toString());
		TicketBookingDto dto2=new TicketBookingDto();
		dto2.setName("Ra");
		dto2.setEmail("rramyap920@gamil.com");
		dto2.setTicketPrice(800);
		dto2.setForm("Davangere");
		dto2.setTo("mysore");
		System.out.println(dto2.toString());
		TicketBookingDto dto3=new TicketBookingDto();
		dto3.setName("Ra");
		dto3.setEmail("rramyap920@gamil.com");
		dto3.setTicketPrice(900);
		dto3.setForm("Davangere");
		dto3.setTo("mysore");
		System.out.println(dto3.toString());
		service.validateandSave(dto);
		service.validateandSave(dto1);
		service.validateandSave(dto2);
		service.validateandSave(dto3);
		service.read();
		
	}

}
