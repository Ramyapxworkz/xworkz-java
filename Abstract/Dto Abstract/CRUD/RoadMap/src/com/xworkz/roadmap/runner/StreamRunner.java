package com.xworkz.roadmap.runner;

import com.xworkz.roadmap.repository.StreamRepository;
import com.xworkz.roadmap.repository.StreamRepositoryimplementation;
import com.xworkz.roadmap.service.StreamService;
import com.xworkz.roadmap.service.StreamServiceImplementation;

public class StreamRunner {

	public static void main(String[] args) {
	StreamRepository respository = new StreamRepositoryimplementation();
//		boolean save=respository.onSave("Civil");
//		System.out.println("Stream saved:"+save);
		
		StreamService service=new StreamServiceImplementation(respository);
		service.validateAndSave("civil");
		service.validateAndSave("CSE");
	}
}
