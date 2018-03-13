package com.example.oa.domain;


/**
 * 用户信息表
 * @author 龙海成
 *
 */
public class UserRole {
	private int roleid;
	private String rolename;

	public UserRole(int roleid, String rolename) {
		this.roleid = roleid;
		this.rolename = rolename;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}
