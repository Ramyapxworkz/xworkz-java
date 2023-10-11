package com.xworkz.september.things;

public class InstagramUser {
	public String username;
	public String profileName;
	public String profilePicture;
	public String bio;
	//public String facilities;
	public InstagramUser() {
		System.out.println(" ..............");
	}
	public InstagramUser(String username,String profileName,String profilePicture,String bio) {
		this.username=username;
		this.profileName=profileName;
		this.profilePicture=profilePicture;
		this.bio=bio;
		//this.facilities=facilities;
		System.out.println(this.username);
		System.out.println(this.profileName);
		System.out.println(this.profilePicture);
		System.out.println(this.bio);
		//System.out.println(this.facilities);
	}


}
