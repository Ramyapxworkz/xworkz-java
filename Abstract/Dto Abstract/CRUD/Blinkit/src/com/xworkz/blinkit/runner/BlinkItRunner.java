package com.xworkz.blinkit.runner;

import com.xworkz.blinkit.constant.Items;
import com.xworkz.blinkit.dto.BlinkItDto;
import com.xworkz.blinkit.repo.BlinkItRepo;
import com.xworkz.blinkit.repo.BlinkItRepoImpl;
import com.xworkz.blinkit.service.BlinkItService;
import com.xworkz.blinkit.service.BlinkItServiceImpl;

public class BlinkItRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in BlinkItRunner....");
		BlinkItDto dto=new BlinkItDto();
		dto.setCustomerName("Childu");
		dto.setEmail("customer@gmail.com");
		dto.setContactNo(9354454984L);
		dto.setCost(100.50d);
		dto.setQuantity(3);
		dto.setNameOfItems(Items.SUGAR.toString());
		dto.setPlaceOrder(true);
		System.out.println(dto.toString());
		
		BlinkItDto dto1=new BlinkItDto();
		dto1.setCustomerName("Childu1");
		dto1.setEmail("customer@gmail.com");
		dto1.setContactNo(9354454944L);
		dto1.setCost(100.50d);
		dto1.setQuantity(2);
		dto1.setNameOfItems(Items.CURD.toString());
		dto1.setPlaceOrder(true);
		System.out.println(dto1.toString());
		
		BlinkItDto dto2=new BlinkItDto();
		dto2.setCustomerName("Childu2");
		dto2.setEmail("customer@gmail.com");
		dto2.setContactNo(9354454484L);
		dto2.setCost(100.50d);
		dto2.setQuantity(3);
		dto2.setNameOfItems(Items.JAGGERY.toString());
		dto2.setPlaceOrder(true);
		System.out.println(dto2.toString());
		
		BlinkItDto dto3=new BlinkItDto();
		dto3.setCustomerName("Childu3");
		dto3.setEmail("customer@gmail.com");
		dto3.setContactNo(9354451984L);
		dto3.setCost(100.50d);
		dto3.setQuantity(3);
		dto3.setNameOfItems(Items.SALT.toString());
		dto3.setPlaceOrder(true);
		System.out.println(dto3.toString());
		
		
		BlinkItRepo repo=new BlinkItRepoImpl();
		BlinkItService service=new BlinkItServiceImpl(repo);
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
		service.read();
		
		System.out.println("===============");
		service.totalCost(dto3);
		service.totalCost(dto1);
		service.totalCost(dto2);
		service.totalCost(dto);
		System.out.println("===============");
		BlinkItDto dtos=new BlinkItDto();
		dtos.setEmail("Ramya@gmail.com");
		
		
		service.update("customer@gmail.com", dtos);
		service.read();
		
		
		
	}

}
