package com.xworkz.customsandle.runner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.customsandle.dto.CustomSandledto;
import com.xworkz.customsandle.service.CustomSandleService;
import com.xworkz.customsandle.service.CustomServiceImpl;
@WebServlet(urlPatterns = "/updateById")
public class UpdateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomSandledto dto = new CustomSandledto();
       int id=Integer.parseInt(req.getParameter("enterId"));
       dto.setId(id);
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
		
		CustomSandleService service=new CustomServiceImpl();
		boolean update=service.update(id, dto);
		
		if(update) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/view.jsp");
			req.setAttribute("message", "Update successfully");
			dispatcher.forward(req, resp);
		}
		
	}

}
