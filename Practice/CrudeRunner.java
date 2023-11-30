package com.xworkz.practice.driver;

import com.xworkz.practice.thing.Crud;

public class CrudeRunner {
	public static void main(String[] args) {
		Crud c=new Crud();
		String[] teamName={"mi","rcb","csk","gt","lsg"};
		String[] captainName= {"Rohit","kholi","dhoni","pandya","rahul"};
		String[] homeGround= {"mumbai","bengaluru","chanai","gurajt","lucknow"};
		int[] noOfPlayers={23,45,67,67,67};
		int[] score={254,123,45,231,111};
		c.getSave(teamName, captainName, homeGround, noOfPlayers, score);
		c.getRead();
	}
		
	}


