package com.xworkz.september.driver;

import com.xworkz.september.things.Hostel;
 
public class HostelRunner {
  public static void main(String args[]) {
	  Hostel hostel=new Hostel();
	  System.out.println(hostel);
	  hostel.name="golden Pg";
	  hostel.food=true;
	  hostel.numOfPeoples=70;
	  hostel.perRoom=6;
	  hostel.rent=5250;
	  System.out.println(hostel.name);
	  System.out.println(hostel.food);
	  System.out.println( hostel.numOfPeoples);
	  System.out.println(hostel.perRoom);
	  System.out.println(hostel.rent);
	  
	  System.out.println("creat 1 object");
	  Hostel hostel1=new Hostel();
	  hostel1.name="golden Pg";
	  hostel1.food=true;
	  hostel1.numOfPeoples=70;
	  hostel1.perRoom=6;
	  hostel1.rent=5250;
	  System.out.println(hostel1.name);
	  System.out.println(hostel1.food);
	  System.out.println( hostel1.numOfPeoples);
	  System.out.println(hostel1.perRoom);
	  System.out.println(hostel1.rent);
	  
	  
	  System.out.println("creat 2 object");
	  Hostel hostel2=new Hostel();
	  hostel2.name="golden Pg";
	  hostel2.food=true;
	  hostel2.numOfPeoples=70;
	  hostel2.perRoom=6;
	  hostel2.rent=5250;
	  System.out.println(hostel2.name);
	  System.out.println(hostel2.food);
	  System.out.println( hostel2.numOfPeoples);
	  System.out.println(hostel2.perRoom);
	  System.out.println(hostel2.rent);
	  
	  
	  new Hostel("golden Pg",66,false,4,5500);
	  
	  
	  
	  
	  
  }
}
