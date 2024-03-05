package com.xworkz.customsandle.runner;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.customsandle.constants.OrderStatus;
import com.xworkz.customsandle.dto.CustomSandledto;
import com.xworkz.customsandle.service.CustomSandleService;
import com.xworkz.customsandle.service.CustomServiceImpl;

@WebServlet(urlPatterns = "/submit")
public class CustomeSandleServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomSandledto dto = new CustomSandledto();

		String name = req.getParameter("enterName");
		System.out.println(name);
		dto.setUserName(name);
		String email = req.getParameter("enterEmail");
		System.out.println(email);
		dto.setEmail(email);
	long number=Long.parseLong(req.getParameter("enterNumber"));
	System.out.println(number);
	dto.setNumber(number);
		String size = req.getParameter("enterSize");
		System.out.println(size);
		dto.setSizeOfSandle(size);
		String width = req.getParameter("enterWidth");
		System.out.println(width);
		dto.setWidth(width);
		String length = req.getParameter("enterLength");
		System.out.println(length);
		dto.setLength(length);
		req.getContentType();
		System.out.println(dto);
		String design=req.getParameter("enterDesign");
		dto.setDesign(design);
		System.out.println(design);
		dto.setStatus(OrderStatus.ACTIVE.toString());
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/success.jsp");
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		dispatcher.forward(req, resp);
		CustomSandleService service=new CustomServiceImpl();
		service.validateandSave(dto);
		service.validRead();
		
//		service.update(id, dto);
		
	}


}
