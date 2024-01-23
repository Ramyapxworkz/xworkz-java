package com.xworkz.crud1operation.repository;

import java.util.List;

import com.xworkz.crud1operation.dto.ConsultancyDto;

public interface ConsultancyRepository {
	boolean onSave(ConsultancyDto consultancyDto);
	List<ConsultancyDto> readAll();
	boolean upDate(String name,ConsultancyDto consultancyDto);
	

}
