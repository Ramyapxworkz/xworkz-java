package com.xworkz.practice.thing;

public class Practiress {
      public static void main(String[] args) {
		String word="RaMyA pVaRun";
		char[] ch=word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(Character.isUpperCase(c)) {
				c=Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				c=Character.toUpperCase(c);
			}
			System.out.print(c);
		}
		
	}
}
