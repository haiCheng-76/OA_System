package com.example.oa.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.example.oa.domain.Borrow_car;
import com.example.oa.service.BorrowCarService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionmanager")
@Transactional
public class BorrowCarTest {
	@Autowired
	private BorrowCarService borrowCarService;

	@Test
	public void testAddBorrowedInfo() {
		Borrow_car b = new Borrow_car();
		b.setCarid(2);
		b.setEmployeeid(3);
		borrowCarService.addBorrowedInfo(b);
	}

	@Test
	public void testUpdateBorrowInfo() {
		Borrow_car b = new Borrow_car();
		b.setCarid(2);
		b.setEmployeeid(3);
		borrowCarService.updateBorrowInfo(b);
	}

	@Test
	public void testDeleteBorrowInfo() {
		Borrow_car b = new Borrow_car();
		getClass();
		b.setBorrow_car_id(1);
		;
		borrowCarService.deleteBorrowInfo(b);
	}

	@Test
	public void testGetallBorrowInfo() {
		borrowCarService.getallBorrowInfo();
	}

}
