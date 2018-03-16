package com.example.oa.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oa.dao.DeviceDao;
import com.example.oa.domain.Device;
import com.example.oa.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {
	@Autowired
	private DeviceDao deviceDao;

	@Override
	public boolean addDevice(Device device) {
		int addnum = deviceDao.addDevice(device);
		return addnum == 1 ? true :false;
	}

	@Override
	public boolean updateDevice(Device device) {
		int updatenum = deviceDao.updateDevice(device);
		return  updatenum == 1 ?true :false;
	}

	@Override
	public boolean deleteDevice(Device device) {
		int deletenum = deviceDao.deleteDevice(device);
		return deletenum == 1 ?true :false;
	}

	@Override
	public Device selectDeviceById(int id) {
		return deviceDao.selectDeviceById(id);
	}

	@Override
	public List<Device> getallDevice() {
		return deviceDao.getallDevice();
	}

}
