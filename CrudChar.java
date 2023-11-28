package com.xworkz.shopping.things;

public class CrudChar {
	int index=0;
	char[] list=new char[4];
	public void getSave(char letters) {
		//System.out.println(list.length);
		
		if(index<list.length) {
			list[index]=letters;
			index++;
		}
	}
	
	public void getread() {
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}
	public void getUpdate(char oldValue,char newValue) {
		for(int i=0;i<list.length;i++) {
			if(list[i]==oldValue) {
				list[i]=newValue;
			}
		}
	}
	
	public void getDelete(char element) {
		for(int i=0;i<list.length;i++) {
			if(list[i]==element) {
				list[i]='\u0000';
			}
		}
	}

}
