package com.xworkz.sankrathi.repository;

import com.xworkz.sankrathi.dto.SankrathiDto;


public interface SankranthiRepo {
		boolean onSave(SankrathiDto sankrathiDto);
		SankrathiDto[] read();
		boolean upDate(String state,SankrathiDto sankrathiDto);
		boolean delete(String state);
		

}


