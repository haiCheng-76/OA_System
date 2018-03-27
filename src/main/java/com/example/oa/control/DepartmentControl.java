package com.example.oa.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.oa.domain.Department;
import com.example.oa.service.DepartmentService;

@Controller
@RequestMapping(value = "/DepartmentControl")
public class DepartmentControl {
	@Autowired
	private DepartmentService departmentService;
	@RequestMapping(value="/getAllDepartment")
	@ResponseBody
	public List<Department> getAllDepartment() {
		return departmentService.getallDepartment();
	}
}
