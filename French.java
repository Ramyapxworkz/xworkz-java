package com.xworkz.september.things;

public class French {
	public String name;
	public String partOfSpeech;
	public String meaning;
	public String usage;
	public String etymology;
	public French() {
		System.out.println(" ..............");
	}
	public French(String name,String partOfSpeech,String meaning,String usage,String etymology) {
		this.name=name;
		this.partOfSpeech=partOfSpeech;
		this.meaning=meaning;
		this.usage=usage;
		this.etymology=etymology;
		System.out.println(this.name);
		System.out.println(this.partOfSpeech);
		System.out.println(this.meaning);
		System.out.println(this.usage);
		System.out.println(this.etymology);
	}

}
