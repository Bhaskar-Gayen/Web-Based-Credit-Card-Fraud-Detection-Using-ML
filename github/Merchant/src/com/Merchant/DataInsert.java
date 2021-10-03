package com.Merchant;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Merchant.dao.Connector;


@WebServlet(name = "Signup/register", urlPatterns = { "/Signup/register" })
public class DataInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int errorcode = 1046;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/marchent";
		String user = "root";
		String password = "";
		Connector c = new Connector(url, user, password);
		if(c.ISconnected())
			System.out.println("Connection Established..");
		else
			System.out.println("Connection Fail!");
		String email = request.getParameter("emailid");
		String name =  request.getParameter("mem_name");
		String gender = request.getParameter("gender");
		String pass = request.getParameter("password");
		String dob = request.getParameter("dd") +"/"+ request.getParameter("mm")+"/" + request.getParameter("yyyy");
		long phno = Long.parseLong(request.getParameter("contactnum"));
		if(c.insert(email, name, pass, gender, dob, phno))
			response.sendRedirect("/Merchant/Login");
		else
			response.sendError(errorcode);
		
		
		
	}
	

}
