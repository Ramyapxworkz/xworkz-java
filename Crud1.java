package com.xworkz.september.things;

public class Crud1 {
	int index=0;
	String[] cricketTeamList=new String[6];
	public void getSave(String teamName) {
		System.out.println(teamName);
		if(index<cricketTeamList.length) {
			cricketTeamList[index]=teamName;
			index++;
		}
	}
	public void getRead() {
		for(int i=0;i<cricketTeamList.length;i++) {
			System.out.println(cricketTeamList[i]);
		}
	}
    public void getUpdate(String oldTeamName,String newTeadName) {
    	for(int i=0;i<cricketTeamList.length;i++) {
    		if(cricketTeamList[i]==oldTeamName) {
    			cricketTeamList[i]=newTeadName;
    		}
    	}
    }
    public void getDelete(String element) {
    	for(int i=0;i<cricketTeamList.length;i++) {
    		if(cricketTeamList[i]==element) {
    			cricketTeamList[i]=null;
    		}
    	}
    }
}
