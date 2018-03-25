package com.example.oa.domain;

/**
 * 员工信息表
 * 
 * @author 龙海成
 *
 */
public class Employee {
	private int employee_id;
	private String employee_account;// 账号名称
	private String username;// 姓名
	private String password;
	private int age;
	private String address;
	private int departmentid;
	private int role;
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Employee() {
	}

	public Employee(String employee_account, String username, String password, int age, String address,
			int departmentid, int role) {
		this.employee_account = employee_account;
		this.username = username;
		this.password = password;
		this.age = age;
		this.address = address;
		this.departmentid = departmentid;
		this.role = role;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_account() {
		return employee_account;
	}

	public void setEmployee_account(String employee_account) {
		this.employee_account = employee_account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

}
