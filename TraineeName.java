package com.xworkz.september.things;

public class TraineeName {
	int index=0;
	String[] traineeList=new String[4];
	public void getTraineeName(String traineeName) {
		System.out.println("..."+traineeName);
		if(index<traineeList.length) {
			
		traineeList[index]=traineeName;
		index++;
		}else {
			System.out.println("trainee name");
		}
	}
	public void getTrainee() {
		for(int i=0;i<traineeList.length;i++) {
			System.out.println(traineeList[i]);
		}
	}

}
