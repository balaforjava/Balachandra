package com.app.test;

import com.app.dao.impl.EmployeeDaoImpl;

public class InsertData {
	
	public static void main(String[] args) {
		
		EmployeeDaoImpl impl=new EmployeeDaoImpl();
		int id=impl.saveEmployee(6,"ravi","teja",24,20000,"IT","84/06/10");
		System.out.println("Employee Successfully Saved with id:");
        
	}

}
