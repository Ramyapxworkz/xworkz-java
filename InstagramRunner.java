package com.xworkz.september.driver;

import com.xworkz.september.things.Instagram;
public class InstagramRunner {
	public static void main(String args[]) {
		Instagram instagram=new Instagram();
		System.out.println(instagram);
		instagram.userName="ramya";
		System.out.println(instagram.userName);
		instagram.passWord=1234567;
		System.out.println(instagram.passWord);
		
		instagram.accountType="personal";
        System.out.println(instagram.accountType);
		
        instagram.isProfileSet=true;
		System.out.println(instagram.isProfileSet);
		
		
		instagram.phoneNumber=6366307666l;
		System.out.println(instagram.phoneNumber);
		instagram.emilId="rramyap@gamil.com";
		System.out.println(instagram.emilId);
		instagram.dob="12/12/2001";
		System.out.println(instagram.dob);
        instagram.location="Bangalore";
        System.out.println(instagram.location);
        instagram.gender="Female";
        System.out.println(instagram.gender);
        instagram.age=20;
        
        System.out.println(instagram.age);
        if(instagram.isProfileSet == true) {
			System.out.println(instagram.userName+" "+instagram.accountType);
		}
         if( instagram.location=="Bangalore") {
        	 System.out.println(instagram.userName);
        	 System.out.println(instagram.passWord);
        	 System.out.println(instagram.accountType);
        	 System.out.println(instagram.isProfileSet);
        	 System.out.println(instagram.phoneNumber);
     		System.out.println(instagram.emilId);
    		System.out.println(instagram.dob);
            System.out.println(instagram.location);
            System.out.println(instagram.gender);
            System.out.println(instagram.age);

        }
         if(instagram.passWord== 0) {
        	 System.out.println("equal to zero");
        	 
         }
         else {
        	 System.out.println("not equal to 0");
         }
        
		
		
	}

}
