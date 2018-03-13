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
	private int roleid;
	private int departmentid;
	private int role;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Employee() {
	}

	public Employee(int employee_id, String employee_account, String username, String password, int age, String address,
			int roleid, int departmentid) {
		this.employee_id = employee_id;
		this.employee_account = employee_account;
		this.username = username;
		this.password = password;
		this.age = age;
		this.address = address;
		this.roleid = roleid;
		this.departmentid = departmentid;
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

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

}
