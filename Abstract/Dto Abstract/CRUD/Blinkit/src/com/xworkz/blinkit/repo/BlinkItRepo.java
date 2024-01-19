package com.xworkz.blinkit.repo;

import com.xworkz.blinkit.dto.BlinkItDto;

public interface BlinkItRepo {
	public boolean save(BlinkItDto blinkItDto);
	BlinkItDto[] read();
	boolean update(String email,BlinkItDto blinkItDto);
	
}
