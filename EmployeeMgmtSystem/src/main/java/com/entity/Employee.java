package com.entity;


public class Employee {
	
//	Define fields
	
	private Integer id;
	
	private String name;
	
	private String dob;

	private String department;
	
	private String salary;
	
	
//	Define getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String getsalary() {
		return salary;
	}

	public void setsalary(String salary) {
		this.salary = salary;
	}

	
	
	//	Define toString()
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", department=" + department +",salary=" + salary + "]";
	} 

	
	
	
	
}
