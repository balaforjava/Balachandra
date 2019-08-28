package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.app.ConnectionFactory;
import com.app.dao.EmployeeDao;
import com.app.model.EmployeeDetail;

public class EmployeeDaoImpl implements EmployeeDao{
	
	@Override
	public Integer saveEmployee(int id,String fname,String lname,int age,int salary,String dept,String dob) {
		
		int count=0;
		Connection connection=ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into EmployeeDetail values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2,fname);
			pstmt.setString(3, lname);
			pstmt.setInt(4, age);
			pstmt.setInt(5, salary);
			pstmt.setString(6, dept);
			pstmt.setString(7, dob);
			count=pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void updateEmployee(int id) {
		
	}

	@Override
	public Integer deleteEmployee(int id) {
		int count1=0;
		Connection connection=ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.
					prepareStatement("delete from EmployeeDetail where id=?");
			        pstmt.setInt(1, id);
			        count1=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count1;
	}

	@Override
	public List<EmployeeDetail> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
