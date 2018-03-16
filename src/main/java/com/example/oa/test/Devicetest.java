package com.example.oa.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.example.oa.domain.Device;
import com.example.oa.service.DeviceService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionmanager")
@Transactional
public class Devicetest {
	@Autowired
	private DeviceService deviceService;

	@Test
	public void testAddDevice() {
		Device device = new Device();
		device.setDevicename("水杯");
		device.setDeviceprice(35.0);
		device.setDevicenumber(45);
		deviceService.addDevice(device);
	}

	@Test
	public void testUpdateDevice() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteDevice() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectDeviceById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetallDevice() {
		fail("Not yet implemented");
	}

}
