package com.xworkz.passportapplication.abstracts;

import com.xworkz.passportapplication.dto.PassportDto;

public abstract class Passport {
           public  abstract boolean onSave(PassportDto passportDto);
           public abstract void read();
           public abstract void searchByAddress(String currentAddress);
           public abstract void searchByContact(long contactNum);
           public abstract void updateByEmail(String email,PassportDto passportDto);
           public abstract void updateByapplicationid(int applicationID,PassportDto passportDto);
           public abstract void deleteByapplicationId(int applicationID);
}
