package com.xworkz.blinkit.dto;

import lombok.Data;

@Data
public class BlinkItDto {
   private String customerName;
   private String email;
   private long contactNo;
   private String nameOfItems;
   private double cost;
   private int quantity;
   private boolean placeOrder;
   
}
