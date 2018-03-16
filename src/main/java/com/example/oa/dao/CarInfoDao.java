package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.CarInfo;

public interface CarInfoDao {
	int addCarInfo(CarInfo carInfo);

	int updateCarInfo(CarInfo carInfo);

	int deleteCarInfo(CarInfo carInfo);

	CarInfo selectCarInfoById(int id);

	List<CarInfo> getallCarInfo();
}
