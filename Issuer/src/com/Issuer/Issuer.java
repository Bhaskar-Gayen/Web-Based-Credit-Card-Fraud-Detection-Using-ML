package com.Issuer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Issuer.dao.*;


@WebServlet("/")
public class Issuer extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get All parameter
		String cardNo =   request.getParameter("card-no");
		String expd =  request.getParameter("expdate");
		int cvv = Integer.parseInt(request.getParameter("cvv"));
		String ip =  request.getParameter("ip");
		String amount = request.getParameter("price");
		String trx_id = request.getParameter("trx_id");
		
		//Connect to Database
		Connector c= dbConnector();
		//Request dispatcher
		RequestDispatcher rd;
		
		//Decline Transaction If limit is over
		float price = Float.parseFloat(amount);
		
		if(c.checkLimit(cardNo, price)) {
			//Allow the Transaction and entry in Database
			c.insert(trx_id, cardNo, expd, cvv, amount, ip);
			request.setAttribute("trx_id", trx_id);
			request.setAttribute("amount", amount);
			request.setAttribute("card-no", cardNo);
			rd = request.getRequestDispatcher("/validate/");
			rd.forward(request, response);
			
		}
		else {
			//Decline the transaction;
			rd = request.getRequestDispatcher("/reject/");
			rd.forward(request, response);
		}
		
		
		
	}
	
	Connector dbConnector() {
		String url ="jdbc:mysql://localhost:3306/issuing_bank";
		String user="root";
		String password="";
		Connector c = new Connector(url, user, password);
		if(c.ISconnected())
			return c;
		return null;
	}

}
