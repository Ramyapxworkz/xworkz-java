package com.xworkz.ticket.runner;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns = "/submit")
public class Runner extends GenericServlet {
	
	public Runner() {
		System.out.println("Constructor");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		
		String name=req.getParameter("enterName");
		System.out.println("Enter name:"+name);
		String name1=req.getParameter("enterNumber");
		System.out.println("Enter number:"+name1);
		
		String name2=req.getParameter("enterEmail");
		System.out.println("Enter email:"+name2);
		
		String name3=req.getParameter("enterAlternativeNumber");
		System.out.println("Enter alternative number:"+name3);
		
		String name4=req.getParameter("enterNumber");
		System.out.println("Enter number:"+name4);
		
	}
	
	

}
