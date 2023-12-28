package com.xworkz.voterid.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class VoterIdDto {
	private String personName;
	private String currentAddress;
	private int age;
	private long adharNumber;
	

}
