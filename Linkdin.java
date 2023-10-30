package com.xworkz.september.things;

public class Linkdin {
	private String jobName;
	private String companyName;
	private String salary;
	private Company company1;
	private JobSeeker jobSeeker;
	public Linkdin() {
		System.out.println("no argument constructor");
	}
	public Linkdin(String jobName, String companyName, String salary, Company company1, JobSeeker jobSeeker) {
		super();
		this.jobName = jobName;
		this.companyName = companyName;
		this.salary = salary;
		this.company1 = company1;
		this.jobSeeker = jobSeeker;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
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
