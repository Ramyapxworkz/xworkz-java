package com.xworkz.roadmap.repository;

public class StreamRepositoryimplementation implements StreamRepository{

	private String []streams=new String[3];
	private int index=0;
		


	@Override
	public boolean onSave(String streamName) {
		if(streams==null||index>=streams.length) {
			System.out.println("array is null or check the length");
		}else {
			// save operation
			if(index<streams.length) {
				streams[index]=streamName;
				index++;
				return true;
			}
		}
		
		return false;
	}



	@Override
	public String[] read() {
		return streams;
	}

}
