package com.xworkz.crud1operation.service;

import com.xworkz.crud1operation.dto.RapidoDto;

public interface RapidoService {
	boolean validateAndSave(RapidoDto rapidoDto);
    void readAll();
    boolean update(String useName,RapidoDto rapidoDto);
}


