package com.xworkz.customsandle.update;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/update")
public class CustomUpdate extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     
		RequestDispatcher dispatcher=req.getRequestDispatcher("/update.jsp");
		String[] parameter= {"enterId","enterName","enterEmail","enterNumber","enterSize","enterWidth","enterLength"};
		for (String string : parameter) {
		  String value=req.getParameter(string);	
		  req.setAttribute(string, value);
		  			
		}
		dispatcher.forward(req, resp);
	
	}
}
