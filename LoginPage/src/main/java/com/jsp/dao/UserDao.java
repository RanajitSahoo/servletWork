package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jsp.entities.User;

public class UserDao {

	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}

	public boolean saveUserReg(User user) {
		boolean flag=false;
		try {
			
			String sql="insert into user(name,email,password) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.executeUpdate();
			flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	

}
