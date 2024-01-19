package com.xworkz.crudoperation.runner;

import com.xworkz.crudoperation.dto.ToysDto;
import com.xworkz.crudoperation.exception.AlphabetException;
import com.xworkz.crudoperation.exception.ColorException;
import com.xworkz.crudoperation.exception.PriceException;
import com.xworkz.crudoperation.repository.ToysRepImpl;
import com.xworkz.crudoperation.repository.ToysRepo;
import com.xworkz.crudoperation.service.ToysService;
import com.xworkz.crudoperation.service.ToysServiceImpl;

public class ToysRunner {
	public static void main(String[] args) throws AlphabetException,PriceException,ColorException {
		ToysDto dto=new ToysDto();
		dto.setName("Dog");
		dto.setPrice(101);
		dto.setColor("Brown");
		System.out.println(dto.toString());
		
		ToysDto dto1=new ToysDto();
		dto1.setName("Elephant");
		dto1.setPrice(106);
		dto1.setColor("pink");
		System.out.println(dto1.toString());
		
		ToysDto dto2=new ToysDto();
		dto2.setName("Cat");
		dto2.setPrice(103);
		dto2.setColor("pink");
		System.out.println(dto2.toString());
		
		ToysDto dto3=new ToysDto();
		dto3.setName("Bear");
		dto3.setPrice(108);
		dto3.setColor("pink");
		System.out.println(dto3.toString());
		
		
		ToysRepo reo=new ToysRepImpl();
		ToysService service=new ToysServiceImpl(reo);
	
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
		service.read();
		ToysDto dto4=new ToysDto();
		dto4.setName("Teddy bear");
		service.update("Elephant", dto4);
		service.read();
		System.out.println("Delete=================");
		reo.delete("Cat");
		service.read();
		
		
		
		
	}

}
