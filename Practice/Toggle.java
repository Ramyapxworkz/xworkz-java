package com.xworkz.practice.thing;

public class Toggle {
	public static void main(String[] args) {
		String sentence="MusicalNight";
		char[] ch=sentence.toCharArray();
		System.out.println(ch);
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
