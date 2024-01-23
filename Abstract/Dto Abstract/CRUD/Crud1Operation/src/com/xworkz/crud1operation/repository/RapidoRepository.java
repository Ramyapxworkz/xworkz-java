package com.xworkz.crud1operation.repository;

import java.util.List;

import com.xworkz.crud1operation.dto.ConsultancyDto;
import com.xworkz.crud1operation.dto.RapidoDto;

public interface RapidoRepository {
	boolean onSave(RapidoDto rapidoDto);
	List<RapidoDto> readAll();
	boolean upDate(String userName,RapidoDto rapidoDto);
	

}
