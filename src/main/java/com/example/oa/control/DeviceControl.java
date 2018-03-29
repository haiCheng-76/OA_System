package com.example.oa.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.oa.domain.Device;
import com.example.oa.service.DeviceService;

@Controller
@RequestMapping(value = "deviceControl")
public class DeviceControl {
	private Logger log = Logger.getLogger(DeviceControl.class);
	@Autowired
	private DeviceService deviceService;
	
	/**
	 * 获得所有设备信息
	 * @return
	 * @author 龙海成
	 */
	@RequestMapping(value = "/getAllDevice")
	@ResponseBody
	public List<Device> getAllDevice() {
		List<Device> listDevice = null;
		try {
			listDevice = deviceService.getallDevice();
		} catch (Exception e) {
			log.info("获得设别信息时网络出错！");
			e.printStackTrace();
		}
		return listDevice;
	}
	
	/**
	 * 通过设备ID获得设备信息
	 * @param ID 设备ID
	 * @return
	 * @author 龙海成
	 */
	@RequestMapping(value = "/getDeviceById")
	@ResponseBody
	public Device getDeviceById(Integer ID) {
		Device device = new Device();
		try {
			device = deviceService.selectDeviceById(ID);
		} catch (Exception e) {
			log.info("通过ID获得设备信息异常，请稍后重试");
			e.printStackTrace();
		}
		return device;
	}
	
	/**
	 * 更新设备信息
	 * @param d 
	 * @return
	 * @author 龙海成
	 */
	@RequestMapping(value = "/updateDevice")
	@ResponseBody
	public String updateDevice(Device d) {
		boolean isupdate = false;
		try {
			isupdate = deviceService.updateDevice(d);
		} catch (Exception e) {
			log.info("更新设备信息时，网络出错");
			e.printStackTrace();
		}
		if (isupdate) {
			return "SUCCESS";
		}
		return "ERROR";
	}
	
	/**
	 * 删除设备信息
	 * @param ID
	 * @return
	 * @author 龙海成
	 */
	@RequestMapping(value="/deleteDevice")
	@ResponseBody
	public String deleteDevice(Integer ID) {
		boolean isdelete = false;
		Device device = new Device();
		device.setDeviceid(ID);
		try {
			isdelete = deviceService.deleteDevice(device);
		} catch (Exception e) {
			log.info("删除设备信息时出错");
			e.printStackTrace();
		}
		if (isdelete) {
			return "SUCCESS";
		}
		return "ERROR";
	}

}
