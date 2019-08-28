package com.app.test;

import com.app.dao.impl.EmployeeDaoImpl;

public class DeleteData {
	
	public static void main(String[] args) {
		
		EmployeeDaoImpl impl=new EmployeeDaoImpl();
		int id=impl.deleteEmployee(1);
		System.out.println("Employee Deleted successfully!!!");
		
		
	}

}
