package com.example.oa.domain;

/**
 * 部门信息表
 *
 * @author 龙海成
 *
 */
public class Department {
	private int departmentid;
	private String departmentname;

	public Department(int departmentid, String departmentname) {
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

}
