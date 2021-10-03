package com.CCserver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CCserver.dao.Connector;


@WebServlet("/")
public class CCservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//trx_id, card_no, exp_date, cvv, amount, ip
		String trx_id="";
		String card_no="";
		String exp_date="";
		int cvv=0;
		String amount="";
		String ip="";
		
		
		//connect to Database
		Connector c= dbConnector();
		c.insert(trx_id, card_no, exp_date, cvv, amount, ip);
		
		
		//Send request to Issuer Bank
		response.sendRedirect("/Issuer/");
	}

	Connector dbConnector() {
		String url ="jdbc:mysql://localhost:3306/credit_card_company";
		String user="root";
		String password="";
		Connector c = new Connector(url, user, password);
		if(c.ISconnected())
			return c;
		return null;
	}
	

}
