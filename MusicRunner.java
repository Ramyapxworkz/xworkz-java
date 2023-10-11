package com.xworkz.september.driver;

import com.xworkz.september.things.Music;

public class MusicRunner {
	public static void main(String[] args) {
		new Music();
		new Music("Bohemian Rhapsody");
		new Music("Bohemian Rhapsody", "Queen", 355, 1975);
	}

}
