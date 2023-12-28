package com.xworkz.voterid.service;

import com.xworkz.voterid.dto.VoterIdDto;
import com.xworkz.voterid.repository.VoterIdRepository;

public class VoterIdServiceImplementation implements VoterIdService {
	private VoterIdRepository repository;

	public VoterIdServiceImplementation(VoterIdRepository repository) {
		this.repository = repository;
	}

	boolean validateName = true;
	boolean validateAdress=true;
	boolean validateAge=true;
	//boolean validateAdhar=true;

	@Override
	public boolean validateSave(VoterIdDto voterIdDto) {
		if (voterIdDto == null) {
			System.out.println("dto is null");
			return false;
		} else {
			if (voterIdDto.getPersonName().equals(null) || voterIdDto.getPersonName().equals("null")
					|| (voterIdDto.getPersonName().length() < 3 && voterIdDto.getPersonName().length() > 10)) {
				System.out.println("give corrent name");
				validateName = false;
			}
			if(voterIdDto.getCurrentAddress().equals(null)||
					voterIdDto.getCurrentAddress().equals("null")||
					(voterIdDto.getCurrentAddress().length()<3&&voterIdDto.getCurrentAddress().length()>25)) {
				System.out.println("give correct address");
				validateAdress=false;
			}
			
			if(!(voterIdDto.getAge()==18||voterIdDto.getAge()>=18||voterIdDto.getAge()>0)) {
				System.out.println("age should be greate than 18 or equal to 18");
				validateAge=false;
			}
			if(voterIdDto.getAge()==-1&&voterIdDto.getAge()==0) {
				System.out.println("it should not contains -1 and 0");
				validateAge=false;
			}
			
			
			
			if(validateName&&validateAdress&&validateAge) {
				
			
			boolean exist=isExist(voterIdDto);
			if(!exist) {
				boolean save=repository.onSave(voterIdDto);
				if(save) {
					System.out.println("dto saves successfully");
					return true;
				}else {
					System.out.println("dto not saved successfully");
					return false;
				}
			}else {
				System.out.println("dto already exist");
				
			}

		}
		}
		return false;
	}

	private boolean isExist(VoterIdDto voterIdDto) {
		VoterIdDto[] dto = repository.read();
		if (dto != null) {
			for (VoterIdDto dtos : dto) {
				if (dtos != null) {
					if (dtos.getPersonName().equals(voterIdDto.getPersonName())) {
						return true;
					}
					if(dtos.getCurrentAddress().equals(voterIdDto.getCurrentAddress())) {
						return true;
					}
					if(dtos.getAdharNumber()==voterIdDto.getAdharNumber()) {
						return true;
					}
	
				}
			}
		}

		return false;
	}
	
//	private boolean validateAdhar(long adharNumber) {
//		int count=0;
//		while(adharNumber>0) {
//			adharNumber=adharNumber/10;
//			count++;
//		}
//		if(count!=12){
//			System.out.println("adhar number not contains 12 number");
//			validateAdhar=false;
//		}
//		return false;
//	}

	@Override
	public void read() {
		VoterIdDto[] dto = repository.read();
		for (VoterIdDto dtos : dto) {
			System.out.println(dtos);
		}

	}

}
