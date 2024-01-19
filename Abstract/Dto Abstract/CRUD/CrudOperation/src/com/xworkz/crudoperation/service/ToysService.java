package com.xworkz.crudoperation.service;

import com.xworkz.crudoperation.dto.ToysDto;
import com.xworkz.crudoperation.exception.AlphabetException;
import com.xworkz.crudoperation.exception.ColorException;
import com.xworkz.crudoperation.exception.PriceException;

public interface ToysService {
	boolean validateAndSave(ToysDto toysDto)throws AlphabetException,PriceException,ColorException;
     boolean read();
     boolean update(String name,ToysDto toysDto);
}
