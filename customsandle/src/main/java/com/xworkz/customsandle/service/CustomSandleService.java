package com.xworkz.customsandle.service;

import java.util.List;

import com.xworkz.customsandle.dto.CustomSandledto;

public interface CustomSandleService {
	boolean validateandSave(CustomSandledto dto);
	List<CustomSandledto> validRead();
	boolean update(int id,CustomSandledto dto);
	boolean delete(int id);
	List<CustomSandledto> readByName(String name);
}
