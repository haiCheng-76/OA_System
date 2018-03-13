package com.example.oa.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.oa.domain.Employee;
import com.example.oa.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml",
		"classpath*:servlet-context.xml" })
public class EmployeeTest {
	@Autowired
	EmployeeService employeeService;

	@Test
	public void test() {
		List<Employee> alllist = employeeService.getallEmployee();
		System.out.println(alllist);
		int lilsnum = alllist.size();
		assertEquals(8, lilsnum);
	}

}
