package com.example.oa.domain;

import java.util.Date;

/**
 * 设备借阅表
 * 
 * @author 龙海成
 *
 */
public class Borrow_device {
	private int borrow_device_id;
	private int borrow_device_deviceid;
	private int employeeid;
	private Date borrow_device_date;

	public Borrow_device(int borrow_device_id, int borrow_device_deviceid, int employeeid, Date borrow_device_date) {
		this.borrow_device_id = borrow_device_id;
		this.borrow_device_deviceid = borrow_device_deviceid;
		this.employeeid = employeeid;
		this.borrow_device_date = borrow_device_date;
	}

	public int getBorrow_device_id() {
		return borrow_device_id;
	}

	public void setBorrow_device_id(int borrow_device_id) {
		this.borrow_device_id = borrow_device_id;
	}

	public int getBorrow_device_deviceid() {
		return borrow_device_deviceid;
	}

	public void setBorrow_device_deviceid(int borrow_device_deviceid) {
		this.borrow_device_deviceid = borrow_device_deviceid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public Date getBorrow_device_date() {
		return borrow_device_date;
	}

	public void setBorrow_device_date(Date borrow_device_date) {
		this.borrow_device_date = borrow_device_date;
	}

}
