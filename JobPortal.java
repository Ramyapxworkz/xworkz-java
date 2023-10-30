package com.xworkz.september.things;

public class JobPortal {
	private String jobSeeker;
	private String linkdin;
	private String indeed;
	private Naukari naukari;
	private Linkdin linkdin1;

	public JobPortal() {
		System.out.println("no argument constructor");
	}

	public JobPortal(String jobSeeker, String linkdin, String indeed, Naukari naukari, Linkdin linkdin1) {
		super();
		this.jobSeeker = jobSeeker;
		this.linkdin = linkdin;
		this.indeed = indeed;
		this.naukari = naukari;
		this.linkdin1 = linkdin1;
	}

	public String getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(String jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	public String getLinkdin() {
		return linkdin;
	}

	public void setLinkdin(String linkdin) {
		this.linkdin = linkdin;
	}

	public String getIndeed() {
		return indeed;
	}

	public void setIndeed(String indeed) {
		this.indeed = indeed;
	}

	public Naukari getNaukari() {
		return naukari;
	}

	public void setNaukari(Naukari naukari) {
		this.naukari = naukari;
	}

	public Linkdin getLinkdin1() {
		return linkdin1;
	}

	public void setLinkdin1(Linkdin linkdin1) {
		this.linkdin1 = linkdin1;
	}

}
