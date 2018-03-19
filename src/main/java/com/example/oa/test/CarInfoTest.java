package com.example.oa.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.example.oa.domain.CarInfo;
import com.example.oa.service.CarService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionmanager")
@Transactional
public class CarInfoTest {
	
	@Autowired
	private CarService carService;

	@Test
	public void testAddCarInfo() {
		CarInfo carInfo = new CarInfo();
		carInfo.setCarname("长城");
		carInfo.setCarnumber("苏A7899");
		carInfo.setCarprice(23.0);
		carService.addCarInfo(carInfo);
	}

	@Test
	public void testUpdateCarInfo() {
		CarInfo carInfo = new CarInfo();
		carInfo.setCarname("长城");
		carInfo.setCarnumber("苏A7899");
		carInfo.setCarprice(23.0);
		carInfo.setCarid(1);
		carService.updateCarInfo(carInfo);
	}

	@Test
	public void testDeleteCarInfo() {
		CarInfo carInfo = new CarInfo();
		carInfo.setCarid(1);
		carService.deleteCarInfo(carInfo);
	}

	@Test
	public void testSelectCarInfoById() {
		carService.selectCarInfoById(1);
	}

	@Test
	public void testGetallCarInfo() {
		carService.getallCarInfo();
	}

}
