package com.xworkz.customsandle.runner;

import java.util.List;

import com.xworkz.customsandle.dto.CustomSandledto;
import com.xworkz.customsandle.service.CustomSandleService;
import com.xworkz.customsandle.service.CustomServiceImpl;

public class Runner {
	public static void main(String[] args) {
		CustomSandleService service=new CustomServiceImpl();
		List<CustomSandledto> dto=service.validRead();
		for (CustomSandledto customSandledto : dto) {
			System.out.println(customSandledto);
		}
		CustomSandledto dto1=new CustomSandledto();
		dto1.setUserName("Ramya");
		dto1.setEmail("rramyap@gmail.com");
		dto1.setLength("7");
		dto1.setNumber(4567887654l);
		dto1.setSizeOfSandle("5");
		dto1.setWidth("3");
		dto1.setDesign("modern");
		
		service.update(1, dto1);
	}

}
