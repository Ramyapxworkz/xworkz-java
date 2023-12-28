package com.xworkz.gamil.service;

import com.xworkz.gmail.dto.GmailDto;

public abstract class GmailService {
	public abstract boolean validateDto(GmailDto gmailDto);
    public abstract void read();
}
