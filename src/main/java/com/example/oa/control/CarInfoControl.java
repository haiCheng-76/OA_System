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
@RequestMapping(value = "/carInfoControl")
public class CarInfoControl {
	private Logger log = Logger.getLogger(CarInfoControl.class);
	@Autowired
	private CarService carService;

	@RequestMapping(value = "/getAllCarIfo")
	@ResponseBody
	public List<CarInfo> getAllCarIfo() {
		List<CarInfo> allCarInfo = null;
		try {
			allCarInfo = carService.getallCarInfo();
		} catch (Exception e) {
			log.info("获取车辆相关信息时，网络出现异常");
			e.printStackTrace();
		}
		return allCarInfo;
	}

	@RequestMapping(value = "/addCarIfo")
	@ResponseBody
	public String addCarIfo(CarInfo carInfo) {
		boolean isadded = false;
		try {
			isadded = carService.addCarInfo(carInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (isadded) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@RequestMapping(value = "/getCarinfoById")
	@ResponseBody
	public CarInfo getCarinfoById(Integer ID) {
		CarInfo carInfo = new CarInfo();
		try {
			carInfo = carService.selectCarInfoById(ID);
		} catch (Exception e) {
			log.info("请求车辆信息时出现异常，请稍后重试");
			e.printStackTrace();
		}
		return carInfo;
	}

	@RequestMapping(value = "/updateCarinfo")
	@ResponseBody
	public String updateCarinfo(CarInfo carInfo) {
		boolean isupdate = false;
		try {
			isupdate = carService.updateCarInfo(carInfo);
		} catch (Exception e) {
			log.info("修改车辆信息时出现异常，请稍后重试");
			e.printStackTrace();
		}
		if (isupdate) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@RequestMapping(value = "/deleteCarinfo")
	@ResponseBody
	public String deleteCarinfo(Integer ID) {
		boolean isdelete = false;
		CarInfo carInfo = new CarInfo();
		carInfo.setCarid(ID);
		try {
			isdelete = carService.deleteCarInfo(carInfo);
		} catch (Exception e) {
			log.info("删除车辆信息时出现异常，请稍后重试");
			e.printStackTrace();
		}
		if (isdelete) {
			return "SUCCESS";
		}
		return "ERROR";
	}

}
