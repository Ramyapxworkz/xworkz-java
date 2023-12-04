package com.xworkz.passportapplication.abstractimplimentaion;

import com.xworkz.passportapplication.abstracts.Passport;
import com.xworkz.passportapplication.dto.PassportDto;

public class PassportImp extends Passport{
       Object[] obj=new Object[3];
       int index=0;
	@Override
	public boolean onSave(PassportDto passportDto) {
		long c=passportDto.getContactNum();
		int count=0;
		while(c>0) {
			count++;
			c=c/10;
		}
		if(count==10)
		
		{
			if(passportDto!=null) {
				System.out.println("its not null");
				if(index<obj.length) {
					obj[index]=passportDto;
					index++;
				}
				return true;
			}
			else {
				System.out.println("its null");
			}
		}else {
			System.out.println("its not euqal to 10");
		}
		return false;
	}
	@Override
	public void read() {
		for(Object objt:obj) {
			System.out.println(objt);
		}
	}
	@Override
	public void searchByAddress(String currentAddress) {
		for(Object objt:obj) {
			if(objt!=null) {
				PassportDto dto=(PassportDto)objt;
				if(dto.getCurrentAddress()==currentAddress) {
					System.out.println(objt);
				}
			}
		}
	}
	
	public void searchByContact(long contactNum) {
		for(Object objt:obj) {
			if(objt!=null) {
				PassportDto dto=(PassportDto)objt;
				if(dto.getContactNum()==contactNum) {
					System.out.println(objt);
				}
			}
		}
	}
	@Override
	public void updateByEmail(String email, PassportDto passportDto) {
    for(Object objt:obj) {
    	if(objt!=null) {
    		PassportDto dto=(PassportDto)objt;
    		if(dto.getEmail()==email) {
    			objt=passportDto;
    		}
    	}
    }
	}
	@Override
	public void updateByapplicationid(int applicationID, PassportDto passportDto) {
		 for(Object objt:obj) {
		    	if(objt!=null) {
		    		PassportDto dto=(PassportDto)objt;
		    		if(dto.getApplicationID()==applicationID) {
		    			objt=passportDto;
		    		}
		    	}
		    }
	}
	@Override
	public void deleteByapplicationId(int applicationID) {
		for(Object objt: obj) {
			if(objt!=null) {
	    		PassportDto dto=(PassportDto)objt;
	    		if(dto.getApplicationID()==applicationID) {
	    			objt=null;
	    		}
	    		System.out.println(objt);
			}
		}
	}
	
	

	
	
	

}
