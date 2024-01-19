package com.xworkz.ticketbooking.repository;

import com.xworkz.ticketbooking.dto.TicketBookingDto;

public interface TicketBookingRepo {
      boolean onSave(TicketBookingDto ticketBookingDto);
      TicketBookingDto[] read();
}
