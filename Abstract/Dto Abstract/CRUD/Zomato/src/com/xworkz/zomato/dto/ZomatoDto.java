package com.xworkz.zomato.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ZomatoDto {
     private String customerName;
     private long number;
     private String email;
     private String foodName;
     private int cost;
     
}
