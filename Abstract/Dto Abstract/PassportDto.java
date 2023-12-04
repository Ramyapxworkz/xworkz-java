package com.xworkz.passportapplication.dto;

import java.util.Date;

public class PassportDto {
	private String name;
	private Date dob;
	private String gender;
	private Date registrationDate;
	private String currentAddress;
	private String permanentAddress;
	private String officeLocation;
	private int age;
	private long contactNum;
	private String email;
	private int applicationID;
	private String paymentOption;
	
	public PassportDto() {
		System.out.println("no argment constructor");
	}

	public PassportDto(String name, Date dob, String gender, Date registrationDate, String currentAddress,
			String permanentAddress, String officeLocation, int age, long contactNum, String email, int applicationID,
			String paymentOption) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.registrationDate = registrationDate;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
		this.officeLocation = officeLocation;
		this.age = age;
		this.contactNum = contactNum;
		this.email = email;
		this.applicationID = applicationID;
		this.paymentOption = paymentOption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	@Override
	public String toString() {
		return "PassportDto [name=" + name + ", dob=" + dob + ", gender=" + gender + ", registrationDate="
				+ registrationDate + ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress
				+ ", officeLocation=" + officeLocation + ", age=" + age + ", contactNum=" + contactNum + ", email="
				+ email + ", applicationID=" + applicationID + ", paymentOption=" + paymentOption + "]";
	}
	
	public int hashcode() {
		return 30;
	}
	public boolean equals(Object obj) {
		if(this==obj) 
		    return true;
		if(obj==null)
			return true;
		if(getClass()!=obj.getClass())
			return false;
			PassportDto dto=(PassportDto)obj;		
	          
		return false;
		
	}
	
	
	

}

