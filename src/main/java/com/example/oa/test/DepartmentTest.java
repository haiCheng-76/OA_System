package com.example.oa.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.example.oa.domain.Department;
import com.example.oa.service.DepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionmanager")
@Transactional
public class DepartmentTest {
	private Logger log = Logger.getLogger(DepartmentTest.class);
	
	@Autowired
	private DepartmentService departmentService;

	@Test
	public void testAddDepartment() {
		Department department = new Department();
		department.setDepartmentname("运营部");
		department.setDepartmenttelephone("4242342424");
		department.setDepartmentaddress("四川省成都市");
		boolean isadded = departmentService.addDepartment(department);
		log.info("是否添加"+isadded);
	}

	@Test
	public void testUpdateDepartment() {
		Department d = new Department();
		d.setDepartmentname("运营部");
		d.setDepartmenttelephone("4242342424");
		d.setDepartmentaddress("四川省成都市");
		boolean isupdate = departmentService.updateDepartment(d);
		log.info("是否修改"+isupdate);
	}

	@Test
	public void testDeleteDepartment() {
		Department d = new Department();
		d.setDepartmentid(1);
		departmentService.deleteDepartment(d);
	}

	@Test
	public void testSelectDepartmentById() {
		Department d = departmentService.selectDepartmentById(1);
		log.info("部门的相关信息："+d);
	}

	@Test
	public void testGetallDepartment() {
		List<Department> alldepartment = departmentService.getallDepartment();
		log.info(alldepartment);
	}

}
