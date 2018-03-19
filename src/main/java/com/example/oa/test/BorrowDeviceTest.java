package com.example.oa.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.example.oa.domain.Borrow_device;
import com.example.oa.service.Borrow_DeviceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionmanager")
@Transactional
public class BorrowDeviceTest {
	
	@Autowired
	private Borrow_DeviceService borrowDeviceServicel;

	@Test
	public void testAddBorrow_Device() {
		Borrow_device b = new Borrow_device();
		b.setBorrow_device_deviceid(1);
		b.setEmployeeid(2);
		borrowDeviceServicel.addBorrow_Device(b);
	}

	@Test
	public void testUpdateBorrow_Device() {
		Borrow_device b = new Borrow_device();
		b.setBorrow_device_deviceid(1);
		b.setEmployeeid(2);
		borrowDeviceServicel.updateBorrow_Device(b);
	}

	@Test
	public void testDeleteBorrow_Device() {
		Borrow_device b = new Borrow_device();
		b.setBorrow_device_id(1);
		borrowDeviceServicel.deleteBorrow_Device(b);
	}

	@Test
	public void testGetallBorrowDeviceInfo() {
		borrowDeviceServicel.getallBorrowDeviceInfo();
	}

}
