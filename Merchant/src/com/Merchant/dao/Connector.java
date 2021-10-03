package com.Merchant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	String url;
	String user;
	String password;
	Connection con;
	Statement st;
	ResultSet set;
	PreparedStatement pst;
	
	public Connector(String url, String user, String password){
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	public boolean ISconnected() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		if(con !=null)
			return true;
		
		return false;
	}
	
	public boolean validate(String uname, String password) {
		String sql = "select * from customers where email=? and password=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, password);
			
			set = pst.executeQuery();
			if(set.next())
				return true;
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
	public void query(String qu){
		try {
			st = con.createStatement();
			set = st.executeQuery(qu);
			
			while(set.next()){
				System.out.print("ID: " + set.getInt("id"));
				System.out.println("Name: " + set.getString("name"));
			}
			set.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public boolean insert(String email, String name, String password, String gender, String dob, long phno ) {
		String sql = "INSERT INTO customers(email, name, password, gender, dob, phno) VALUES (?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, name);
			pst.setString(3, password);
			pst.setString(4, gender);
			pst.setString(5, dob);
			pst.setLong(6, phno);
			return !pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	


}
