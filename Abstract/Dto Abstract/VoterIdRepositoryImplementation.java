package com.xworkz.voterid.repository;

import com.xworkz.voterid.dto.VoterIdDto;

public class VoterIdRepositoryImplementation implements VoterIdRepository {
        private VoterIdDto[] voterIdDtoList=new VoterIdDto[3];
        private int index=0;
	@Override
	public boolean onSave(VoterIdDto VoterIdDto) {
		if(VoterIdDto!=null) {
			if(index<voterIdDtoList.length) {
				voterIdDtoList[index]=VoterIdDto;
				index++;
				return true;
			}
		}
		
		return false;
	}
	@Override
	public VoterIdDto[] read() {
		return voterIdDtoList;
	}
	

}
