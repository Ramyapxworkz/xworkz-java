package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

 class Painting {
	 private String color;
	 private int numOfColors;
	 protected String pictureName;
	 
   	 public Painting() {
   		 System.out.println("No argument constructor");
   	 }
	public Painting(String color, int numOfColors) {
		this.color = color;
		this.numOfColors = numOfColors;

		
	}
	protected class Painting1{
		public int picturePrice;
		public String paintingName;
		public Painting1() {
			System.out.println("/////////////////////////////////");
		}
		public Painting1(int picturePrice, String paintingName) {
			this.picturePrice = picturePrice;
			this.paintingName = paintingName;
		}
		
		
		
	}
   	 
	 
	 
	 
	

}
