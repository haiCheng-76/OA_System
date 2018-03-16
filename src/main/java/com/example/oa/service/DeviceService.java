package com.example.oa.service;

import java.util.List;

import com.example.oa.domain.Device;

public interface DeviceService {
	boolean addDevice(Device device);

	boolean updateDevice(Device device);

	boolean deleteDevice(Device device);

	Device selectDeviceById(int id);

	List<Device> getallDevice();
}
