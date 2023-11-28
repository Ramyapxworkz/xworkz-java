package com.xworkz.shopping.things;

public class CrudDouble {
		int index=0;
		double[] list=new double[4];
		public void getSave(double letters) {
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
		public void getUpdate(double oldValue,double newValue) {
			for(int i=0;i<list.length;i++) {
				if(list[i]==oldValue) {
					list[i]=newValue;
				}
			}
		}
		
		public void getDelete(double element) {
			for(int i=0;i<list.length;i++) {
				if(list[i]==element) {
					list[i]=0.0;
				}
			}
		}

}
