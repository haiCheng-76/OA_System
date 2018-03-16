package com.example.oa.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.oa.dao.Borrow_DeviceDao;
import com.example.oa.domain.Borrow_device;
import com.example.oa.service.Borrow_DeviceService;

@Service
public class Borrow_DeviceServiceImpl implements Borrow_DeviceService {

	@Autowired
	private Borrow_DeviceDao borrowDeviceDao;

	@Override
	public boolean addBorrow_Device(Borrow_device borrow_device) {
		int addnum = borrowDeviceDao.addBorrow_Device(borrow_device);
		return addnum == 1 ? true : false;
	}

	@Override
	public boolean updateBorrow_Device(Borrow_device borrow_device) {
		int updatenum = borrowDeviceDao.updateBorrow_Device(borrow_device);
		return updatenum == 1 ? true : false;
	}

	@Override
	public boolean deleteBorrow_Device(Borrow_device borrow_device) {
		int deletenum = borrowDeviceDao.deleteBorrow_Device(borrow_device);
		return deletenum == 1 ? true : false;
	}

	@Override
	public List<Borrow_device> getallBorrowDeviceInfo() {
		return borrowDeviceDao.getallBorrowDeviceInfo();
	}

}
