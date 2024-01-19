package com.xworkz.crudoperation.repository;

import com.xworkz.crudoperation.dto.ToysDto;

public interface ToysRepo {
	boolean onSave(ToysDto toysDto);
	ToysDto[] read();
	boolean update(String name,ToysDto toysDto);
	boolean delete(String name);

}
