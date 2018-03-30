package com.example.oa.domain;

import java.io.Serializable;

/**
 * 设备信息表
 * 
 * @author 龙海成
 *
 */
public class Device implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2122214321771489638L;
	private int deviceid;
	private String devicename;
	private double deviceprice;
	private int devicenumber;
	private String manufacture;

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public Device() {
	}

	public Device(String devicename, double deviceprice, int devicenumber) {
		this.devicename = devicename;
		this.deviceprice = deviceprice;
		this.devicenumber = devicenumber;
	}

	public int getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public double getDeviceprice() {
		return deviceprice;
	}

	public void setDeviceprice(double deviceprice) {
		this.deviceprice = deviceprice;
	}

	public int getDevicenumber() {
		return devicenumber;
	}

	public void setDevicenumber(int devicenumber) {
		this.devicenumber = devicenumber;
	}

}
