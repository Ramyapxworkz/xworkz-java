package com.xworkz.ticketbooking.dto;

import lombok.Data;

@Data
public class TicketBookingDto {
  private String name;
  private String email;
  private int ticketPrice;
  private String form;
  private String to;
  
}
