package com.xworkz.september.things;

public class Music {
	public String title;
	public String artist;
	public int duration;
	public int releaseYear;
	public Music () {
		System.out.println("default constructor.....");
	}
	public Music(String title) {
		this.title=title;
		System.out.println(this.title);
	}
    public Music(String title,String artist,int duration,int releaseYear) {
    	this.artist=artist;
    	this.duration=duration;
    	this.releaseYear=releaseYear;
    	System.out.println(this.artist);
    	System.out.println(this.duration);
    	System.out.println(this.releaseYear);
    }
}
