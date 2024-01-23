package com.xworkz.crud1operation.repository;

import java.util.List;

import com.xworkz.crud1operation.dto.BarDto;


public interface BarRepository {
	boolean onSave(BarDto barDto);
	List<BarDto> readAll();
	boolean upDate(String userName,BarDto barDto);

}
