package com.CCserver.dao;

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
	
	public boolean validate(String cardNo) {
		String sql = "select * from card_detail where card_no=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, cardNo);
			
			set = pst.executeQuery();
			if(set.next())
				return true;
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return false;
		
	}
	
	
	public boolean insert(String trxid, String cardNo, String expd, int cvv, String amount, String ip) {
		String sql = "INSERT INTO trx_details(trx_id, card_no, exp_date, cvv, amount, ip) VALUES (?,?,?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, trxid);
			pst.setString(2, cardNo);
			
			pst.setString(3, expd);
			pst.setLong(4, cvv);
			pst.setString(5, amount);
			pst.setString(6, ip);
			
			return !pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	


}
