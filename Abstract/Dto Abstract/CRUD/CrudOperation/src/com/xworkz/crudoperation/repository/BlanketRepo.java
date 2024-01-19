package com.xworkz.crudoperation.repository;

import com.xworkz.crudoperation.dto.BlanketDto;

public interface BlanketRepo {
	boolean onSave(BlanketDto blanketDto);
	BlanketDto[] read();
	boolean update(String blanketName,BlanketDto blanketDto);
boolean delete(int blacketsPrice);
}
