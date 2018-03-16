package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.Device;

public interface DeviceDao {
	int addDevice(Device device);

	int updateDevice(Device device);

	int deleteDevice(Device device);

	Device selectDeviceById(int id);

	List<Device> getallDevice();
}
