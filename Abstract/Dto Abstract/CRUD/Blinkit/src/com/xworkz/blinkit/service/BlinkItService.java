package com.xworkz.blinkit.service;

import com.xworkz.blinkit.dto.BlinkItDto;

public interface BlinkItService {
	boolean validateAndSave(BlinkItDto blinkItDto);
	void read();
	boolean totalCost(BlinkItDto blinkItDto);
	boolean update(String email,BlinkItDto blinkItDto);
	
}
