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
@WebServlet(urlPatterns = "/delete")
public class DeleteServelet extends HttpServlet{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   CustomSandleService service=new  CustomServiceImpl(); 
	   int id=Integer.parseInt(req.getParameter("enterId"));
	  boolean delete= service.delete(id);
	   if(delete) {
	   RequestDispatcher dispatcher=req.getRequestDispatcher("/view.jsp");
	   req.setAttribute("DeleteMessage", "Deleted SuccessFully");
	   dispatcher.forward(req, resp);
	   }
	   
   
   
   }
}
