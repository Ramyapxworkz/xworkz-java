package com.xworkz.customsandle.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.customsandle.constants.OrderStatus;
import com.xworkz.customsandle.dto.CustomSandledto;
import com.xworkz.customsandle.entity.CustomEntity;
import com.xworkz.customsandle.repository.CustomSandleRepo;
import com.xworkz.customsandle.repository.CustomSandleRepoImpl;
import com.xworkz.customsandle.service.CustomSandleService;

public class CustomServiceImpl implements CustomSandleService{
	CustomSandleRepo repo=new CustomSandleRepoImpl();
	
	@Override
	public boolean validateandSave(CustomSandledto dto) {
		CustomEntity entity=new CustomEntity();
		entity.setId(dto.getId());
		entity.setUserName(dto.getUserName());
		entity.setEmail(dto.getEmail());
		entity.setLength(dto.getLength());
		entity.setSizeOfSandle(dto.getSizeOfSandle());
		entity.setNumber(dto.getNumber());
		entity.setWidth(dto.getWidth());
		entity.setDesign(dto.getDesign());
		entity.setStatus(dto.getStatus());
		repo.onsave(entity);
		System.out.println(entity);
		return false;
	}

	@Override
	public List<CustomSandledto> validRead() {
		List<CustomEntity> entity=repo.read();
		List<CustomSandledto> readAll=new ArrayList<CustomSandledto>();
		if(entity!=null) {
		for (CustomEntity customEntity : entity) {
			if(customEntity!=null) {
			if((customEntity.getStatus().equalsIgnoreCase(OrderStatus.ACTIVE.toString()))) {
			CustomSandledto sandledto=new CustomSandledto(); 
			sandledto.setId(customEntity.getId());
			sandledto.setUserName(customEntity.getUserName());
			sandledto.setEmail(customEntity.getEmail());
			sandledto.setNumber(customEntity.getNumber());
			sandledto.setSizeOfSandle(customEntity.getSizeOfSandle());
			sandledto.setLength(customEntity.getLength());
			sandledto.setWidth(customEntity.getWidth());
			sandledto.setDesign(customEntity.getDesign());
			readAll.add(sandledto);
			}
			}
		}
		}
		return readAll;
	}

	@Override
	public boolean update(int id, CustomSandledto dto) {
		CustomEntity entity=new CustomEntity();
		entity.setId(dto.getId());
		entity.setUserName(dto.getUserName());
		entity.setEmail(dto.getEmail());
		entity.setLength(dto.getLength());
		entity.setSizeOfSandle(dto.getSizeOfSandle());
		entity.setNumber(dto.getNumber());
		entity.setWidth(dto.getWidth());
		entity.setDesign(dto.getDesign());
		repo.onsave(entity);
		System.out.println(entity);
		boolean update=repo.update(id, entity);
		if(update) {
			System.out.println("Updated successfully");
			return update;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		boolean delete=repo.delete(id);
		if(delete) {
			return true;
		}
		return false;
	}

	@Override
	public List<CustomSandledto> readByName(String name) {
		List<CustomEntity> entity=repo.readByName(name);
		List<CustomSandledto> readAll=new ArrayList<CustomSandledto>();
		if(entity!=null) {
		for (CustomEntity customEntity : entity) {
			if(customEntity!=null) {
			if((customEntity.getStatus().equalsIgnoreCase(OrderStatus.ACTIVE.toString()))) {
			CustomSandledto sandledto=new CustomSandledto(); 
			sandledto.setId(customEntity.getId());
			sandledto.setUserName(customEntity.getUserName());
			sandledto.setEmail(customEntity.getEmail());
			sandledto.setNumber(customEntity.getNumber());
			sandledto.setSizeOfSandle(customEntity.getSizeOfSandle());
			sandledto.setLength(customEntity.getLength());
			sandledto.setWidth(customEntity.getWidth());
			sandledto.setDesign(customEntity.getDesign());
			readAll.add(sandledto);
			}
			}
		}
		}
		return readAll;
	}



}
