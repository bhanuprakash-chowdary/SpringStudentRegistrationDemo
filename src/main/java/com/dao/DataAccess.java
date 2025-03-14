package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class DataAccess 
{
	public void insert(Student s) 
	{
	try 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement","root","*******");
		PreparedStatement ps=cn.prepareStatement("insert into student(sname,sage,scity,smobile) values(?,?,?,?)");
		ps.setString(1,s.getName());
		ps.setString(2,s.getAge());
		ps.setString(3,s.getMobile());
		ps.setString(4,s.getCity());
		
		ps.executeUpdate();
		
		ps.close();
		cn.close();
	} 
	catch (ClassNotFoundException e) 
	{
		e.printStackTrace();
	} 
	catch (SQLException e)
	{
		e.printStackTrace();
	}
	}

}
