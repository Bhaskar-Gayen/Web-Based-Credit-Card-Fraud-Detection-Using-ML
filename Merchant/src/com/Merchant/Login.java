package com.Merchant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Merchant.dao.Connector;


@WebServlet(name = "/Login", urlPatterns = { "/Login/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/marchent";
		String user = "root";
		String password = "";
		String uname = request.getParameter("username");
		String pass  = request.getParameter("pass");
		Connector c = new Connector(url, user, password);
		if(c.ISconnected() && c.validate(uname, pass)) {
			HttpSession  session = request.getSession();
			session.setAttribute("user", uname);
			response.sendRedirect("/Merchant/Shopping");
		}
		else
			response.sendRedirect("/Merchant/Login");
	}

}
