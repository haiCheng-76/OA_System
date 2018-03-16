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
	private String departmenttelephone;
	private String departmentaddress;

	public Department() {
	}

	public Department(int departmentid, String departmentname, String departmenttelephone, String departmentaddress) {
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.departmenttelephone = departmenttelephone;
		this.departmentaddress = departmentaddress;
	}

	public String getDepartmenttelephone() {
		return departmenttelephone;
	}

	public void setDepartmenttelephone(String departmenttelephone) {
		this.departmenttelephone = departmenttelephone;
	}

	public String getDepartmentaddress() {
		return departmentaddress;
	}

	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
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
