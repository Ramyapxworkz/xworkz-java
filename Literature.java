package com.xworkz.september.things;

public class Literature {
	public String bookTitle;
	public int pageCount;
	public String penType;
	public String inkColor;
	public String letterContent;
	public Literature() {
		System.out.println("default constructor:....");
		}
	public Literature(String bookTitle,int pageCount) {
		this.bookTitle=bookTitle;
		this.pageCount=pageCount;
		System.out.println("book Title:"+this.bookTitle+" "+"Page Count:"+this.pageCount);	
	}
	public Literature(String bookTitle,int pageCount,String penType,String inkColor,String letterContent) {
		this.penType=penType;
		this.inkColor=inkColor;
		this.letterContent=letterContent;
		System.out.println(this.penType);
		System.out.println(this.inkColor);
		System.out.println(this.letterContent);
		
	}

}
