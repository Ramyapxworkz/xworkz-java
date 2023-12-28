package com.xworkz.voterid.runner;

import com.xworkz.voterid.dto.VoterIdDto;
import com.xworkz.voterid.repository.VoterIdRepository;
import com.xworkz.voterid.repository.VoterIdRepositoryImplementation;
import com.xworkz.voterid.service.VoterIdService;
import com.xworkz.voterid.service.VoterIdServiceImplementation;

public class VoterIdRunner {
	public static void main(String[] args) {
		VoterIdDto dto=new VoterIdDto();
		dto.setPersonName("Ramya");
		dto.setAge(18);
		dto.setCurrentAddress("Davanagere");
		dto.setAdharNumber(23333333333l);
		System.out.println(dto.toString());
		VoterIdDto dto1=new VoterIdDto();
		dto1.setPersonName("Pooja");
		dto1.setAge(18);
		dto1.setCurrentAddress("Banaglore");
		dto1.setAdharNumber(123333343333l);
		System.out.println(dto1.toString());
		VoterIdDto dto2=new VoterIdDto();
		dto2.setPersonName("Megha");
		dto2.setAge(1);
		dto2.setCurrentAddress("Mysore");
		dto2.setAdharNumber(12335333333l);
		System.out.println(dto2.toString());
		
		
		VoterIdRepository repo=new VoterIdRepositoryImplementation();
		VoterIdService service=new VoterIdServiceImplementation(repo);
		service.validateSave(dto);
		service.validateSave(dto1);
		service.validateSave(dto2);
		service.read();
		
		
	}

}
