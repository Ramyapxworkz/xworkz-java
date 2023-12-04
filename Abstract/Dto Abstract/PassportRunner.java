package com.xworkz.passportapplication.runner;

import java.util.Date;

import com.xworkz.passportapplication.abstractimplimentaion.PassportImp;
import com.xworkz.passportapplication.abstracts.Passport;
import com.xworkz.passportapplication.constants.Gender;
import com.xworkz.passportapplication.constants.PaymentOption;
import com.xworkz.passportapplication.dto.PassportDto;

public class PassportRunner {
	public static void main(String[] args) {
		Passport p=new PassportImp();
		PassportDto passportDto=new PassportDto();
		passportDto.setName("Ramya");
		passportDto.setDob(new Date());
		passportDto.setGender(Gender.FEMALE.toString());
		passportDto.setRegistrationDate(new Date());
		passportDto.setCurrentAddress("Bangalore");
		passportDto.setPermanentAddress("Davanagere");
		passportDto.setOfficeLocation("Darvada");
		passportDto.setAge(22);
		passportDto.setContactNum(12345898l);
		passportDto.setEmail("rramyap@gmail.com");
		passportDto.setApplicationID(1);
		passportDto.setPaymentOption(PaymentOption.ONLINE.toString());
		
		
	   System.out.println(p.onSave(passportDto));
	   
	   
	   
	   PassportDto passportDto1=new PassportDto();
		passportDto1.setName("varun");
		passportDto1.setDob(new Date());
		passportDto1.setGender(Gender.MALE.toString());
		passportDto1.setRegistrationDate(new Date());
		passportDto1.setCurrentAddress("Davanagere");
		passportDto1.setPermanentAddress("Bnagalore");
		passportDto1.setOfficeLocation("Darvada");
		passportDto1.setAge(23);
		passportDto1.setContactNum(1234567848l);
		passportDto1.setEmail("varun@gmail.com");
		passportDto1.setApplicationID(2);
		passportDto1.setPaymentOption(PaymentOption.ONLINE.toString());
		System.out.println(p.onSave(passportDto1));
		
		
		 PassportDto passportDto2=new PassportDto();
			passportDto2.setName("megha");
			passportDto2.setDob(new Date());
			passportDto2.setGender(Gender.FEMALE.toString());
			passportDto2.setRegistrationDate(new Date());
			passportDto2.setCurrentAddress("durga");
			passportDto2.setPermanentAddress("Bnagalore");
			passportDto2.setOfficeLocation("Darvada");
			passportDto2.setAge(23);
			passportDto2.setContactNum(1234564498l);
			passportDto2.setEmail("megha@gmail.com");
			passportDto2.setApplicationID(3);
			passportDto2.setPaymentOption(PaymentOption.ONLINE.toString());
			System.out.println(p.onSave(passportDto2));
			p.read();
			
			
			System.out.println("search by current address");
			p.searchByAddress("durga");
			System.out.println("search by contact num");
			p.searchByContact(1234567848l);
		
			System.out.println("update by email");
			
			//p.updateByEmail("megha@gamil.com", passportDto2);
			
			passportDto2.setName("megha");
			passportDto2.setDob(new Date());
			passportDto2.setGender(Gender.FEMALE.toString());
			passportDto2.setRegistrationDate(new Date());
			passportDto2.setCurrentAddress("durga");
			passportDto2.setPermanentAddress("Bnagalore");
			passportDto2.setOfficeLocation("Darvada");
			passportDto2.setAge(23);
			passportDto2.setContactNum(1234564498l);
			passportDto2.setEmail("megha123@gmail.com");
			passportDto2.setApplicationID(4);
			passportDto2.setPaymentOption(PaymentOption.ONLINE.toString());
	     //p.read();
	   
	     passportDto1.setApplicationID(8);
	     p.read();
	     System.out.println("delete by application id");
   		p.deleteByapplicationId(4);
	 	
	   
	}

}
