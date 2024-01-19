package com.xworkz.crudoperation.service;

import com.xworkz.crudoperation.dto.BlanketDto;
import com.xworkz.crudoperation.exception.PriceException;

public interface BlanketService {
	boolean validateandSave(BlanketDto blanketDto)throws PriceException ;
    void read();
}
