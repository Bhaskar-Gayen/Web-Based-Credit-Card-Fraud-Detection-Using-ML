package com.Acquiring.dao;

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
	
	//trxid,cardNo, name, expd, cvv, amount, ip, terminal_id
	
	public boolean insert(String trxid, String cardNo, String name, String expd, int cvv, String amount, String ip, int terminal_id) {
		String sql = "INSERT INTO trx_req(trx_id, card_no,name, exp_date, cvv, amount, ip, terminal_id) VALUES (?,?,?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, trxid);
			pst.setString(2, cardNo);
			pst.setString(3, name);
			pst.setString(4, expd);
			pst.setInt(5, cvv);
			pst.setString(6, amount);
			pst.setString(7, ip);
			pst.setInt(8, terminal_id);
			
			return !pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	


}
