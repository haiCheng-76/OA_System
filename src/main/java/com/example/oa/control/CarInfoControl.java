package com.example.oa.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.oa.domain.CarInfo;
import com.example.oa.service.CarService;

@Controller
@RequestMapping(value="/carInfoControl")
public class CarInfoControl {
	private Logger log = Logger.getLogger(CarInfoControl.class);
	@Autowired
	private CarService carService;
	@RequestMapping(value="/getAllCarIfo")
	@ResponseBody
	public List<CarInfo> getAllCarIfo(){
		List<CarInfo> allCarInfo = null;
		try {
			allCarInfo = carService.getallCarInfo();
		} catch (Exception e) {
			log.info("获取车辆相关信息时，网络出现异常");
			e.printStackTrace();
		}
		return allCarInfo;
	}
}
