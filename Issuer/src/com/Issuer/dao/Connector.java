package com.Issuer.dao;

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
	
	public boolean checkLimit(String card_no, float amount) {
		String sql = "select card_limit from card_issue where card_no=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, card_no);
			
			set = pst.executeQuery();
			if(set.next()&&amount<=set.getDouble("card_limit")) 
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
	
	//trx_id, card_no, exp_date, cvv, amount, ip
	//trx_id	card_no	exp_date	cvv	date_time	amount	ip	latitude	longitude
	
	public boolean insert(String trx_id, String card_no, String exp_date, int cvv, String amount, String ip) {
		String sql = "INSERT INTO trx_details(trx_id, card_no, exp_date, cvv, amount, ip) VALUES (?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, trx_id);
			pst.setString(2, card_no);
			pst.setString(3, exp_date);
			pst.setInt(4, cvv);
			pst.setString(5, amount);
			pst.setString(6, ip);
			return !pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	


}
