package com.xworkz.september.things;

public class Curd1 {
	int index=0;
	String[] countryList=new String[6];
	public void getInformation(String countryName) {
		System.out.println(countryName);
		if(index<countryList.length) {
			countryList[index]=countryName;
			index++;
		}
	}
	public void getRead() {
		for(int i=0;i<countryList.length;i++) {
			System.out.println(countryList[i]);
			//if(countryList[i]==null) {
			//System.out.println(countryList[i]);
			//}
		}
}
	public void getUpdate(String oldCountryName,String newCountryName) {
		for(int i=0;i<countryList.length;i++) {
			if(countryList[i]==oldCountryName) {
				countryList[i]=newCountryName;
				
			}
		}
	}
	public void getDelete(String element) {
		for(int i=0;i<countryList.length;i++) {
			if(countryList[i]==element)
			{
				countryList[i]=null;
				System.out.println(countryList[i]);
			}
			/*if(i==(countryList.length-1)&&countryList[i]!=element) {
				System.out.println("..............");
			}*/
		}
	}
	

}
