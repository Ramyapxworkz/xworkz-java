package com.xworkz.zomato.repository;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoRepository {
	boolean onSave(ZomatoDto zomatoDto);
	ZomatoDto[] read();
	boolean update(String email,ZomatoDto zomatoDto);
	
	boolean delete(String email);
	boolean contactDelete(long number);
}
