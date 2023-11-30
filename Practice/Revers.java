package com.xworkz.practice.thing;

public class Revers {
	public static void main(String[] args) {
		String sentence="Sapthasagaradache yello";
		String wordrevers="yello";
		String[] word=sentence.split(" ");
		String revers="";
		for(int w=0;w<word.length;w++) {
			System.out.println("........."+word[w]);
			if(word[w].equalsIgnoreCase(wordrevers)) {
				for(int i=word[w].length()-1;i>=0;i--) {
				revers=revers+word[w].charAt(i);	
				}
				System.out.println(revers);
				word[w]=revers;
			}
			
		}
		
		for(String w:word) {
			System.out.print(w+" ");
		}
	}
	

}
