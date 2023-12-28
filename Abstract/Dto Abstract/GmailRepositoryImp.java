package com.xworkz.gmail.repository;

import com.xworkz.gmail.dto.GmailDto;

public class GmailRepositoryImp extends GamilRepositoryabstract {
          
	GmailDto[] dto=new GmailDto[3];
	int index=0;
	@Override
	public boolean onSave(GmailDto gmailDto) {
		for(int i=0;i<dto.length;i++) {
			if(dto[i]!=null) {
				if(dto[i].equals(gmailDto)) {
					System.out.println("object is present");
					return false;
				}
			}
		}
		   
			   if(index<dto.length) {
				   dto[index]=gmailDto;
				   index++;
				   System.out.println("Dto saved sussesfully");
				   return true;
			   }else {
				  System.out.println("dto not saved ");
				   return false;
			   }
		   
		
	}
	@Override
	public GmailDto[] read() {
//		   for(GmailDto dtos:dto) {
//			   System.out.println(dtos);
//		   }
		return dto;
	
	}

}
