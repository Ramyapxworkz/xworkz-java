package com.xworkz.customsandle.dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class CustomSandledto {
	@Id
	private int id;
	private String userName;
	private String email;
	private String sizeOfSandle;
	private String width;
	private String length;
	private String design;
	private long number;
	private String status;
	

}
