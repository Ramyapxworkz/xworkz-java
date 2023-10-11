package com.xworkz.september.things;

public class Biology {
	public String dnaSequence;
	public String microorganismType;
	public String microorganismName;
     public  String cellType;
     public int cellCount;
     public Biology(){
    	 System.out.println("default constructor...");
     }
     public Biology(String dnaSequence,String microorganismType) {
    	 this.dnaSequence=dnaSequence;
    	 this.microorganismType=microorganismType;
    	 System.out.println("DNA sequence:"+ this.dnaSequence);
    	 System.out.println(" Micro organism Type:"+this.microorganismType);
    	 
     }
     public Biology(String dnaSequence,String microorganismType,String microorganismName,String cellType,int cellCount) {
    	 this.microorganismName=microorganismName;
    	 this.cellType=cellType;
    	 this.cellCount=cellCount;
    	 System.out.println("Micro organism Name: "+this.microorganismName);
    	 System.out.println("Cell Type:"+this.cellType);
    	 System.out.println("Cell Count:"+this.cellCount);
     }
     

}
