package com.xworkz.customsandle.runner;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.customsandle.dto.CustomSandledto;
import com.xworkz.customsandle.service.CustomSandleService;
import com.xworkz.customsandle.service.CustomServiceImpl;
@WebServlet(urlPatterns = "/viewData")
public class CustomVeiw extends HttpServlet{
	List<CustomSandledto> orderList;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/view.jsp");
		CustomSandleService service=new CustomServiceImpl();
		    orderList=service.validRead();
		
		
		req.setAttribute("orderList", orderList);
		dispatcher.forward(req, resp);
		
	}
	

}
