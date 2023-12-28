package com.xworkz.gamil.service;

import com.xworkz.gmail.dto.GmailDto;
import com.xworkz.gmail.repository.GamilRepositoryabstract;
import com.xworkz.gmail.repository.GmailRepositoryImp;

public class GmailServiceImp extends GmailService {
	GamilRepositoryabstract rep=new GmailRepositoryImp();
	@Override
	public boolean validateDto(GmailDto gmailDto) {
		if(gmailDto!= null) {
			boolean resultFistName=validateFirstName(gmailDto.getFirstName());
			boolean resultLastName=validateLastName(gmailDto.getLastName());
			boolean resultcontact=validatecontactnum(gmailDto.getContactNumber());
			boolean resultusename=validateusername(gmailDto.getUserName());
			boolean resultPassword=validatePassword(gmailDto.getPassWord());
			
			if(resultFistName&&resultLastName&&resultcontact&&resultusename&&resultPassword) {
				boolean save=rep.onSave(gmailDto);
				if(save) {
				System.out.println(" saved");}
				else {
					System.out.println("not saved");
				}
				
			}
		}
		
		return false;
	}
	
	private boolean validateFirstName(String firstName) {
		if(firstName.isEmpty()) {
			System.out.println("name is empty");
			return false;
		}else if(firstName.isBlank()) {
			System.out.println("name is blank");
			return false;
		}
		return true;
	}
	
	private boolean validateLastName(String lastName) {
		if(lastName.isEmpty()) {
			System.out.println("last name is empty");
			return false;
		}
		else if(lastName.isBlank()) {
			System.out.println("last name is blank");
			return false;
		}
		return true;
	}
	
	private boolean validatecontactnum(String contactNumber) {
		if(contactNumber.isEmpty()) {
			System.out.println("its not empty");
			return false;
		}else if(contactNumber.isBlank()) {
			System.out.println("its not blanck");
			return false;
		}

		return true;
	}
	
	
	
	private boolean validateusername(String userName) {
		if(userName.isEmpty()) {
			System.out.println("its not empty");
			return false;
		}else if(userName.isBlank()) {
			System.out.println("its not blanck");
			return false;
		}
//		if(userName.length()<3) {
//			System.out.println("user name is not valid");
//			return false;
//		}
		
		
		return true;
	}
	private boolean validatePassword(String passWord) {
		if(passWord.isEmpty()) {
			System.out.println("it is empty");
			return false;
		}else if(passWord.isBlank()) {
			System.out.println("it is blank");
			return false;
		}
//		else if(!(passWord.length()<5&& passWord.startsWith("R"))) {
//			System.out.println("if is not valid");
//			return false;
//		}
		return true;
	}	
	
	private boolean validDob(String dob) {
		if(dob.isEmpty()) {
			return false;
		}else if(dob.isBlank()) {
			return false;
		}
		return true;
	}
	
	private boolean validGender(String gender) {
		if(gender.isEmpty()) {
			return false;
		}else if(gender.isBlank()) {
			return false;
		}
		return true;
	}
	private boolean validaddress(String address) {
		if(address.isEmpty()) {
			return false;
		}else if(address.isBlank()) {
			return false;
		}
		return true;
	}
	
	private boolean validaccountType(String accountType) {
		if(accountType.isEmpty()) {
			return false;
		}else if(accountType.isBlank()) {
			return false;
		}
		return true;
	}

	

	@Override
	public void read() {
		GmailDto[] dto=rep.read();
		for(GmailDto gmaildtos:dto) {
			System.out.println("read dto:"+gmaildtos);
			
		}
	}
	
	
}
