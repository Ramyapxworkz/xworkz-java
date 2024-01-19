package com.xworkz.ticketbooking.service;

import com.xowrkz.ticketbooking.exception.NameLengthException;
import com.xowrkz.ticketbooking.exception.TicketPriceException;
import com.xworkz.ticketbooking.dto.TicketBookingDto;

public interface TicketBookingService {
       boolean validateandSave(TicketBookingDto ticketBookingDto)throws NameLengthException, TicketPriceException ;
       void read();
}
