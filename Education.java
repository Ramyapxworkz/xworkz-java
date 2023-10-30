package com.xworkz.september.things;

public class Education {
	private String instituteName;
	private String branchName;
	private String studentName;
	private String studentEmail;
	private long studentNumber;

	public Education() {
		System.out.println(".......................");
	}

	public Education(String instituteName, String branchName, String studentName, String studentEmail,
			long studentNumber) {
		this.instituteName = instituteName;
		this.branchName = branchName;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentNumber = studentNumber;

	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void setbranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getbranchName() {
		return this.branchName;
	}

}
