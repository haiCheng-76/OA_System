package com.example.oa.domain;

import java.io.Serializable;

/**
 * 员工信息表
 * 
 * @author 龙海成
 *
 */
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8907322023129797048L;
	private Integer employee_id;
	private String employee_account;// 账号名称
	private String username;// 姓名
	private String password;
	private Integer age;
	private String address;
	private Integer departmentid;
	private Integer role;
	private String departmentName;
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
