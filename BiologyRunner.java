package com.xworkz.september.driver;

import com.xworkz.september.things.Biology;

public class BiologyRunner {
   public static void main(String args[]) {
	   new Biology();
	   new Biology("ATCGATCGATCG...","Bacteria");
	   new Biology("ATCGATCGATCG...","Bacteria","E coil"," Animal Cell",1000);
   }
}
