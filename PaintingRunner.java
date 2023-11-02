package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Drawing;

public class PaintingRunner {
	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.setColor("red");
		drawing.setNumOfColors(7);
		drawing.setPictureName("bird");
		System.out.println(drawing.getColor());
		System.out.println(drawing.getNumOfColors());
		System.out.println(drawing.getPictureName());
		//Painting1 p=drawing.new Painting1();
	}

}
