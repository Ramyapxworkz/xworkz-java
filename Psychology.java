package com.xworkz.september.things;

public class Psychology {
	public String name;
	public String founder;
	public String keyPrinciples;
	public String influence;
	public String historicalContext;
	public Psychology() {
		System.out.println(" ..............");
	}
	public Psychology(String name,String founder,String keyPrinciples,String influence,String historicalContext) {
		this.name=name;
		this.founder=founder;
		this.keyPrinciples=keyPrinciples;
		this.influence=influence;
		this.historicalContext=historicalContext;
		System.out.println(this.name);
		System.out.println(this.founder);
		System.out.println(this.keyPrinciples);
		System.out.println(this.influence);
		System.out.println(this.historicalContext);
	}

}
