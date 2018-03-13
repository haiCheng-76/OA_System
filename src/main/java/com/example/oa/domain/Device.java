package com.example.oa.domain;


/**
 * 设备信息表
 * @author 龙海成
 *
 */
public class Device {
	private int deviceid;
	private String devicename;
	private double deviceprice;
	private int devicenumber;

	public Device(int deviceid, String devicename, double deviceprice, int devicenumber) {
		this.deviceid = deviceid;
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
