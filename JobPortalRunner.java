package com.xworkz.september.driver;

import com.xworkz.september.things.Company;
import com.xworkz.september.things.Education;
import com.xworkz.september.things.JobPortal;
import com.xworkz.september.things.JobSeeker;
import com.xworkz.september.things.Linkdin;
import com.xworkz.september.things.Naukari;

public class JobPortalRunner {
	public static void main(String[] args) {
		JobPortal j=new JobPortal();
		j.setIndeed("Indeed");
		System.out.println(j.getIndeed());
		j.setJobSeeker("Job seeker");
		System.out.println(j.getJobSeeker());
		j.setLinkdin("LinkdIn");
		System.out.println(j.getLinkdin());
		
		Naukari n= new Naukari();
		n.setJobTitle("Trainee Engineer");
		n.setCompany("quest global");
		n.setLocation("bangalore");
		Education e=new Education();
		e.setbranchName("ECE");
		e.setInstituteName("JNNCE");
		e.setStudentEmail("rramyap920@gmail.com");
		e.setStudentName("Ramya P");
		e.setStudentNumber(682727226l);
		Company c=new Company();
		c.setCompanyName("TCS");
		c.setContactNum(7878787878l);
		c.setLocation("bangalore");
		c.setPosition("senior engineer");
		JobSeeker j1=new JobSeeker();
		j1.setContactInformation("122121");
		j1.setName("huhuh");
		j1.setNoticePeriod("12");
		//j1.setSkills{"hj","hh"};
		j1.setQualification("BE");
		j1.setYearsOfExperience(1);
		Linkdin l=new Linkdin();
		l.setCompanyName("TC");
		l.setJobName("trainee Engineer");
		l.setSalary("22000");
		
		c.setEducation(e);
		j1.setEducation(e);
		n.setCompany1(c);
		n.setJobSeeker(j1);
		l.setCompany1(c);
		l.setJobSeeker(j1);
		j.setNaukari(n);
		j.setLinkdin1(l);
		System.out.println(j.getLinkdin1().getCompany1().getCompanyName());
		System.out.println(j.getNaukari().getJobSeeker().getNoticePeriod());
		System.out.println(j.getLinkdin1().getCompany1().getEducation().getStudentName());
		System.out.println(j.getLinkdin1().getJobSeeker().getEducation().getInstituteName());
		

		
		
		
	}

}
