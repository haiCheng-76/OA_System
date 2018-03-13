package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.CarInfo;

public interface CarInfoDao {
	boolean addCarInfo(CarInfo carInfo);

	boolean updateCarInfo(CarInfo carInfo);

	boolean deleteCarInfo(CarInfo carInfo);

	CarInfo selectCarInfoById(int id);

	List<CarInfo> getallCarInfo();
}
