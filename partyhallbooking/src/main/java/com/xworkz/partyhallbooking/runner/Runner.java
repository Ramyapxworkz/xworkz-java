package com.xworkz.partyhallbooking.runner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class Runner extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=req.getParameter("enterName");
		System.out.println(userName);
		String enterNumber=req.getParameter("enterNumber");
		System.out.println(enterNumber);
		String enterEmail=req.getParameter("enterEmail");
		System.out.println(enterEmail);
		String enterAlternativeNumber=req.getParameter("enterAlternativeNumber");
		System.out.println(enterAlternativeNumber);
		String enterAmount=req.getParameter("enterAmount");
		System.out.println(enterAmount);
		String enterTime=req.getParameter("enterTime");
		System.out.println(enterTime);
		
		String enterPlace=req.getParameter("enterPlace");
		System.out.println(enterPlace);
		
		String enterNumberofPeople=req.getParameter("enterNumberofPeoples");
		System.out.println(enterNumberofPeople);
		
		req.getContentType();
	    res.setContentType("html");
		PrintWriter printWriter=res.getWriter();
		printWriter.print("<h1 style=\"text-align: center; color: hotpink; \">"+"Thanks for Booking"+"</h1>");
		printWriter.print("<p style=\"text-align: center;\">"+"UserName:"+userName+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Contact Number:"+enterNumber+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Email:"+enterEmail+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Alternative number:"+enterAlternativeNumber+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Amount:"+enterAmount+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Timings:"+enterTime+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Place:"+enterPlace+"</p>");
		printWriter.print("<p style=\"text-align: center;\">"+"Number of people:"+enterNumberofPeople+"</p>");
		printWriter.print("<form style=\"text-align: center;\"> action=\"index.html\">");
		printWriter.print("<button type=\"submit\">submit </button>");
		printWriter.print("</form>");
		printWriter.close();
			
	}
	
	
	

}
