package com.xworkz.customsandle.repository;

import java.util.List;

import com.xworkz.customsandle.entity.CustomEntity;

public interface CustomSandleRepo {
	boolean onsave(CustomEntity entity);
	
	List<CustomEntity> read();
	
	boolean update(int id,CustomEntity entity);
	boolean delete(int id);
	List<CustomEntity> readByName(String name);

}
