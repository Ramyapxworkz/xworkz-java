package com.xworkz.gamil.runner;

import com.xworkz.gamil.service.GmailService;
import com.xworkz.gamil.service.GmailServiceImp;
import com.xworkz.gmail.constants.AccountType;
import com.xworkz.gmail.constants.Gender;
import com.xworkz.gmail.dto.GmailDto;

public class GamilRunner {
	public static void main(String[] args) {
		GmailDto dto=new GmailDto();
		dto.setFirstName("Ramya");
		dto.setLastName("P");
		dto.setMiddleName(" ");
		dto.setContactNumber("1234567897");
		dto.setUserName("rtyu");
		dto.setAlternativecontactNumber("45678909");
		dto.setPassWord("Ra787");
		dto.setDob("12/12/2001");
		dto.setGender(Gender.FEMALE.toString());
		dto.setAddress("Davanagere");
		dto.setAccountType(AccountType.PERSONAL.toString());

		GmailDto dto1=new GmailDto();
		dto1.setFirstName("varun");
		dto1.setLastName("PV");
		dto1.setMiddleName(" ");
		dto1.setContactNumber("1234577897");
		dto1.setUserName("rttu");
		dto1.setAlternativecontactNumber("4567998909");
		dto1.setPassWord("Ra707");
		dto1.setDob("11/12/2001");
		dto1.setGender(Gender.MALE.toString());
		dto1.setAddress("Davanagere");
		dto1.setAccountType(AccountType.PERSONAL.toString());
		
		
		GmailDto dto2=new GmailDto();
		dto2.setFirstName("sneha");
		dto2.setLastName("s");
		dto2.setMiddleName(" ");
		dto2.setContactNumber("12342267897");
		dto2.setUserName("rtyuu");
		dto2.setAlternativecontactNumber("45644909");
		dto2.setPassWord("Re7878");
		dto2.setDob("12/11/2011");
		dto2.setGender(Gender.FEMALE.toString());
		dto2.setAddress("Davanagere");
		dto2.setAccountType(AccountType.PERSONAL.toString());
		
		
		GmailService ser=new GmailServiceImp();
		ser.validateDto(dto);
		ser.validateDto(dto1);
		ser.validateDto(dto2);
		ser.read();
		
		
		
	}

}
