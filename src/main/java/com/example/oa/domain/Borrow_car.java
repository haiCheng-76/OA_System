package com.example.oa.domain;

/**
 * 车辆借阅表
 * @author 龙海成
 *
 */
public class Borrow_car {
	private int borrow_car_id;
	private int carid;
	private String borrow_date;
	private int employeeid;

	public Borrow_car(int borrow_car_id, int carid, String borrow_date, int employeeid) {
		this.borrow_car_id = borrow_car_id;
		this.carid = carid;
		this.borrow_date = borrow_date;
		this.employeeid = employeeid;
	}

	public int getBorrow_car_id() {
		return borrow_car_id;
	}

	public void setBorrow_car_id(int borrow_car_id) {
		this.borrow_car_id = borrow_car_id;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

}
