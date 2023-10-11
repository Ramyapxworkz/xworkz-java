package com.xworkz.september.things;

public class Theater {
	public String title;
	public String playwright;
	public String genre;
	public String setting;
	public String director;
	public Theater() {
		System.out.println(" ..............");
	}
	public Theater(String title,String playwright,String genre,String setting,String director) {
		this.title=title;
		this.playwright=playwright;
		this.genre=genre;
		this.setting=setting;
		this.director=director;
		System.out.println(this.title);
		System.out.println(this.playwright);
		System.out.println(this.genre);
		System.out.println(this.setting);
		System.out.println(this.director);
	}

}
