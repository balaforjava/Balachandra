package com.app.dao;

import java.util.List;

import com.app.model.EmployeeDetail;

public interface EmployeeDao {
	
	public Integer saveEmployee(int id,String fname,String lname,int age,int salary,String dept,String dob);
	public void updateEmployee(int id);
	public Integer deleteEmployee(int id);
	public List<EmployeeDetail> getAllEmployees();

}
