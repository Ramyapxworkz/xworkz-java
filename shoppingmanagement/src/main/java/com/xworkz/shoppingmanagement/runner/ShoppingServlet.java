package com.xworkz.shoppingmanagement.runner;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class ShoppingServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    String name=req.getParameter("enterProduct");
	    System.out.println(name);
	   int quantity=Integer.parseInt(req.getParameter("enterQuantity"));
	   System.out.println(quantity);
	   int price=Integer.parseInt(req.getParameter("enterPrice"));
	   System.out.println(price);
	    
	   
	   double pay=0;
	   if(quantity==10) {
		   double discount=quantity*0.05;
		    pay=price*10-discount;
		   
	   }else {
		 pay=price* quantity;
		 
	   }
	   System.out.println(pay);
	
	   
	   RequestDispatcher dispatcher=req.getRequestDispatcher("/success.jsp");
	   
	   req.setAttribute("name", name);
	   req.setAttribute("price", pay);
	   dispatcher.forward(req, res);
	   
	}
	

}
