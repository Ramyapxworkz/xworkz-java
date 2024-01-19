package com.xworkz.crudoperation.runner;

import com.xworkz.crudoperation.dto.BlanketDto;
import com.xworkz.crudoperation.exception.PriceException;
import com.xworkz.crudoperation.repository.BlanketRepo;
import com.xworkz.crudoperation.repository.BlanketRepoImpl;
import com.xworkz.crudoperation.service.BlanketService;
import com.xworkz.crudoperation.service.BlanketServiceImpl;

public class BlanketRunner {
	public static void main(String[] args) throws PriceException {
		BlanketRepo repo=new BlanketRepoImpl();
		BlanketService service=new BlanketServiceImpl(repo);
		BlanketDto dto=new BlanketDto();
		dto.setBlanketName("Abc");
		dto.setBlacketsPrice(102);
		System.out.println(dto.toString());
		
		BlanketDto dto1=new BlanketDto();
		dto1.setBlanketName("Abcd");
		dto1.setBlacketsPrice(105);
		System.out.println(dto1.toString());
		BlanketDto dto2=new BlanketDto();
		dto2.setBlanketName("Abce");
		dto2.setBlacketsPrice(109);
		System.out.println(dto2.toString());
		service.validateandSave(dto);
		service.validateandSave(dto1);
		service.validateandSave(dto2);
		service.read();
		
	}

}
