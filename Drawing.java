package com.xworkz.shopping.things;

import lombok.NoArgsConstructor;
import com.xworkz.shopping.things.Painting.Painting1;;

//@NoArgsConstructor
public class Drawing extends Painting{
	
      public Drawing() {
    	super("black",4);
    	//Painting name = new Painting();
    	//name.pictureName="bird";
    	//System.out.println(name.pictureName);
    	  System.out.println(super.getColor());
    	  System.out.println(super.getNumOfColors());
    	  System.out.println(super.getPictureName());
    	  //@SuppressWarnings("unused")
		Painting1 p=new Painting1();
		p.picturePrice=2000;
		p.paintingName="Radha Krishna";
		System.out.println(p.picturePrice);
		System.out.println(p.paintingName);
		
		
		
    	  
                	
     }
}
