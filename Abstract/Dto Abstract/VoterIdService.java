package com.xworkz.voterid.service;

import com.xworkz.voterid.dto.VoterIdDto;

public interface VoterIdService {
       boolean validateSave(VoterIdDto voterIdDto);
       
       void read();
       
}
