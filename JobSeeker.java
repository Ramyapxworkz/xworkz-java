package com.xworkz.september.things;

public class JobSeeker {
	private String name;
	private String qualification;
	private String contactInformation;
	private String[] skills;
	private int yearsOfExperience;
	private String noticePeriod;
	private Education education;

	public JobSeeker() {
		System.out.println(".......................");
	}

	public JobSeeker(String name, String qualification, String contactInformation, String[] skills,
			int yearsOfExperience, String noticePeriod, Education education) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.contactInformation = contactInformation;
		this.skills = skills;
		this.yearsOfExperience = yearsOfExperience;
		this.noticePeriod = noticePeriod;
		this.education = education;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

}
