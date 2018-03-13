package com.example.oa.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.example.oa.domain.Employee;
import com.example.oa.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionmanager")
@Transactional
public class EmployeeTest {
	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testIsUser() {
		boolean hasuser = employeeService.getuserByUPR("6", "555", 0);
		assertEquals(true, hasuser);
	}

	@Test
	public void testForgetPassword() {
		Employee e = new Employee();
		e.setEmployee_account("6");
		e.setRole(0);
		e.setPassword("555");
		boolean isupdate = employeeService.updatePassword(e);
		assertEquals(true, isupdate);
	}

	@Test
	public void testDeleteEmployee() {
		Employee e = new Employee();
		e.setEmployee_id(10);
		boolean isdelete = employeeService.deleteEmployee(e);
		assertEquals(true, isdelete);
	}

	@Test
	public void testAddEmployee() {
		Employee e = new Employee();
		e.setEmployee_account("555");
		e.setUsername("555");
		e.setPassword("666");
		e.setAge(45);
		e.setAddress("四川省成都市");
		e.setDepartmentid(2);
		e.setRole(0);
		boolean isadded = employeeService.addEmployee(e);
		assertEquals(true, isadded);
	}

}
