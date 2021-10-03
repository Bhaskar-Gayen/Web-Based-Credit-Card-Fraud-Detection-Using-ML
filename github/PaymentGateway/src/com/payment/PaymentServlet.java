package com.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/pay")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ip = request.getRemoteAddr();
		String name = request.getParameter("Name");
		String cardNo = request.getParameter("card-no");
		String expd = request.getParameter("expdate");
		int cvv = Integer.parseInt(request.getParameter("cvv"));
		String amount = request.getParameter("price");
		int terminal = Integer.parseInt(request.getParameter("terminal_id"));
		

		
//		System.out.println(request.getQueryString());
		
		
		//Redirect to Acquiring Bank server
		response.sendRedirect("/Acquiring_Bank/?" + request.getQueryString()+"&ip="+ip);
		
		
	}

}
