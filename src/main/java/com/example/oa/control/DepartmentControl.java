package com.example.oa.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.oa.domain.Department;
import com.example.oa.service.DepartmentService;

@Controller
@RequestMapping(value = "/DepartmentControl")
public class DepartmentControl {
	private Logger log = Logger.getLogger(DepartmentControl.class);
	@Autowired
	private DepartmentService departmentService;
	@RequestMapping(value="/getAllDepartment")
	@ResponseBody
	public List<Department> getAllDepartment() {
		List<Department> listDepartment = null;
		try {
			listDepartment = departmentService.getallDepartment();
			log.info("请求部门相关信息成功");
		} catch (Exception e) {
			log.info("请求部门相关信息失败");
			e.printStackTrace();
		}
		return listDepartment;
	}
}
