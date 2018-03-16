package com.example.oa.service;

import java.util.List;

import com.example.oa.domain.Borrow_device;

public interface Borrow_DeviceService {
	boolean addBorrow_Device(Borrow_device borrow_device);

	boolean updateBorrow_Device(Borrow_device borrow_device);

	boolean deleteBorrow_Device(Borrow_device borrow_device);

	List<Borrow_device> getallBorrowDeviceInfo();
}
