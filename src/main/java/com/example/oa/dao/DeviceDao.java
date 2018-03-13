package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.Device;

public interface DeviceDao {
	boolean addDevice(Device device);

	boolean updateDevice(Device device);

	boolean deleteDevice(Device device);

	Device selectDeviceById(int id);

	List<Device> getallDevice();
}
