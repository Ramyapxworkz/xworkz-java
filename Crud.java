package com.xworkz.september.things;

public class Crud {
	int index=0;
	String[] branchList=new String[4];
	public void getSave(String branchName) {
		System.out.println(branchName);
		if(index<branchList.length) {
			branchList[index]=branchName;
			index++;
		}
	}
	public void getRead() {
		for(int i=0;i<branchList.length;i++) {
			System.out.println("Get Read:   "+branchList[i]);
		}
	}
	public void getUpdate(String oldBranchName,String newBranchName) {
		for(int i=0;i<branchList.length;i++) {
			if(branchList[i]==oldBranchName) {
				branchList[i]=newBranchName;
			}
		}
	}
	public void getDelete(String element) {
		for(int i=0;i<branchList.length;i++) {
			if(branchList[i]==element) {
				branchList[i]=null;
			}
		}
	}
	

}
