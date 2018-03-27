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
@RequestMapping(value="deviceControl")
public class DeviceControl {
	private Logger log = Logger.getLogger(DeviceControl.class);
	@Autowired
	private DeviceService deviceService;
	@RequestMapping(value="/getAllDevice")
	@ResponseBody
	private List<Device> getAllDevice() {
		List<Device> listDevice = null;
		try {
			listDevice = deviceService.getallDevice();
		} catch (Exception e) {
			log.info("获得设别信息时网络出错！");
			e.printStackTrace();
		}
		return listDevice;
	}
}
