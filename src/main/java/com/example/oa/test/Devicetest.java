package com.example.oa.test;

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
		Device device = new Device();
		device.setDevicename("张三");
		device.setDevicenumber(45);
		device.setDeviceprice(33.0);
		deviceService.updateDevice(device);
	}

	@Test
	public void testDeleteDevice() {
		Device device = new Device();
		device.setDeviceid(1);
		deviceService.deleteDevice(device);
	}

	@Test
	public void testSelectDeviceById() {
		deviceService.selectDeviceById(1);
	}

	@Test
	public void testGetallDevice() {
		deviceService.getallDevice();
	}

}
