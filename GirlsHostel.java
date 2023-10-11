package com.xworkz.september.things;

public class GirlsHostel {
	public String hostelName;
	public int numOfStudent;
	public int fee;
 GirlsHostel(){
	 System.out.println("default constructor");
 }
 GirlsHostel(String hostelname,int numOfStudent,int fee){
	 this.hostelName=hostelname;
	 this.numOfStudent=numOfStudent;
	 this.fee=fee;
	 System.out.println("hostelName:"+this.hostelName+" "+"numOfStudent: "+this.numOfStudent+" "+"fee:"+this.fee);
 }
	

}
