package com.xworkz.blinkit.repo;

import java.util.Iterator;

import com.xworkz.blinkit.dto.BlinkItDto;

public class BlinkItRepoImpl implements BlinkItRepo {
    private BlinkItDto[] dto=new BlinkItDto[4];
    private int index=0;
	@Override
	public boolean save(BlinkItDto blinkItDto) {
		System.out.println("Invoking save");
		if(blinkItDto!=null) {
			if(index<dto.length) {
				dto[index]=blinkItDto;
				index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public BlinkItDto[] read() {
		return dto;
	}
	@Override
	public boolean update(String email, BlinkItDto blinkItDto) {
if(blinkItDto!=null && email!=null) {
	for (int i = 0; i < dto.length; i++) {
		if(dto[i]!=null) {
			if(dto[i].getEmail().equalsIgnoreCase(email)){
				dto[i]=blinkItDto;
				return true;
			}
		}
	}
}
		return false;
	}

}
