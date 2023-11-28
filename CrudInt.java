package com.xworkz.shopping.things;

public class CrudInt {
	int index=0;
	int[] list=new int[4];
	public void getSave(int letters) {
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
	public void getUpdate(int oldValue,int newValue) {
		for(int i=0;i<list.length;i++) {
			if(list[i]==oldValue) {
				list[i]=newValue;
			}
		}
	}
	
	public void getDelete(int element) {
		for(int i=0;i<list.length;i++) {
			if(list[i]==element) {
				list[i]=0;
			}
		}
	}

}
