package com.xworkz.september.things;

public class Company {
	private String companyName;
	private String position;
	private String location;
	private long contactNum;
	private Education education;

	public Company() {
		System.out.println(".......................");
	}

	public Company(String companyName, String position, String location, long contactNum, Education education) {
		super();
		this.companyName = companyName;
		this.position = position;
		this.location = location;
		this.contactNum = contactNum;
		this.education = education;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

}
