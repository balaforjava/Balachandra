package com.app.model;

public class EmployeeDetail {
	
	private int id;
	private String fname;
	private String lname;
	private int age;
	private int salary;
	private String dept;
	private String dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", salary="
				+ salary + ", dept=" + dept + ", dob=" + dob + "]";
	}
	
	
	
}
