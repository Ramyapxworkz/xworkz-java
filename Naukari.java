package com.xworkz.september.things;

public class Naukari {
	private String jobTitle;
	private String company;
	private String location;
	private Company company1;
	private JobSeeker jobSeeker;
	public Naukari() {
		System.out.println("no argument constructor");
	}
	public Naukari(String jobTitle, String company, String location, Company company1,JobSeeker jobSeeker) {
		super();
		this.jobTitle = jobTitle;
		this.company = company;
		this.location = location;
		this.company1 = company1;
		this.jobSeeker=jobSeeker;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Company getCompany1() {
		return company1;
	}
	public void setCompany1(Company company1) {
		this.company1 = company1;
	}
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	
	
	

}
