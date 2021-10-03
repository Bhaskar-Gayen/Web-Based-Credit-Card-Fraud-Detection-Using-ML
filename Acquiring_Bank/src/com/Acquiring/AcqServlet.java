package com.Acquiring;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Acquiring.dao.Connector;


@WebServlet("/")
public class AcqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		String name = request.getParameter("Name");
		String cardNo =   request.getParameter("card-no");
		String expd =  request.getParameter("expdate");
		int cvv = Integer.parseInt(request.getParameter("cvv"));
		String ip =  request.getParameter("ip");
		String amount = request.getParameter("price");
		int terminal_id =Integer.parseInt(request.getParameter("terminal_id"));
		
		//Generate Transaction ID
		IDGen id = new IDGen();
		String trxid = id.generate(11);
		
		//Connection with Database
		Connector c =dbConnection();
		if(c.insert(trxid,cardNo, name, expd, cvv, amount, ip, terminal_id))
			System.out.println("Transaction Entry into Database");
		else
			System.out.println("There is problem while Accassing Databae");
		
		//include trx_id with request before redirect
		response.sendRedirect("/CC_Server/?"+request.getQueryString()+"&trx_id="+trxid);
		
	}

	Connector dbConnection() {
		String url="jdbc:mysql://localhost:3306/acquiring_bank";
		String user="root";
		String password="";
		
		Connector c = new Connector(url, user, password);
		if(c.ISconnected())
			return c;
		
		return null;
	}

}
