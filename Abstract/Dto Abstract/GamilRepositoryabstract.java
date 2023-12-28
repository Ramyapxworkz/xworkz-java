package com.xworkz.gmail.repository;

import com.xworkz.gmail.dto.GmailDto;

public abstract class GamilRepositoryabstract {
           public abstract boolean onSave(GmailDto gmailDto);
           public abstract GmailDto[] read();
}
