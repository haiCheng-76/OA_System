package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.Borrow_device;

public interface Borrow_DeviceDao {
	int addBorrow_Device(Borrow_device borrow_device);

	int updateBorrow_Device(Borrow_device borrow_device);

	int deleteBorrow_Device(Borrow_device borrow_device);

	List<Borrow_device> getallBorrowDeviceInfo();
}
