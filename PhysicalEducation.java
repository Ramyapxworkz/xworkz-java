package com.xworkz.september.things;

public class PhysicalEducation {
	public String activityName;
	public String instructorName;
	public String location;
	public String day;
	public String time;
	public PhysicalEducation() {
		System.out.println("........");
	}
     public PhysicalEducation(String activityName,String instructorName) {
    	 this.activityName=activityName;
    	 this.instructorName=instructorName;
    	 System.out.println(this.activityName);
    	 System.out.println(this.instructorName);
    	 
     }
     public PhysicalEducation(String activityName,String instructorName,String location,String day,String time) {
    	 this.location=location;
    	 this.day=day;
    	 this.time=time;
    	 System.out.println(this.location);
    	 System.out.println(this.day);
    	 System.out.println(this.time);
     }
}
