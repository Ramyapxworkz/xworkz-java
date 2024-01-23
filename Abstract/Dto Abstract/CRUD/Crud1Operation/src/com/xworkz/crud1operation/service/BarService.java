package com.xworkz.crud1operation.service;

import com.xworkz.crud1operation.dto.BarDto;

public interface BarService {
	boolean validateAndSave(BarDto barDto);
    void readAll();
    boolean update(String name,BarDto barDto);
}
