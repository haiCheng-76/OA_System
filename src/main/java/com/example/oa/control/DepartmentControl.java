
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

	@RequestMapping(value = "/getAllDepartment")
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

	@RequestMapping(value = "/getDepartmentById")
	@ResponseBody
	public Department getDepartmentById(Integer ID) {
		Department department = new Department();
		try {
			department = departmentService.selectDepartmentById(ID);
		} catch (Exception e) {
			log.info("请求部门信息时出现异常，请稍后重试");
			e.printStackTrace();
		}
		return department;
	}

	@RequestMapping(value = "/updateDepartment")
	@ResponseBody
	public String updateDepartment(Department d) {
		boolean isupdate = false;
		try {
			isupdate = departmentService.updateDepartment(d);
		} catch (Exception e) {
			log.info("修改部门信息时，出现异常，请稍后重试");
			e.printStackTrace();
		}
		if (isupdate) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@RequestMapping(value = "/deleteDepartment")
	@ResponseBody
	public String deleteDepartment(Integer ID) {
		Department d = new Department();
		d.setDepartmentid(ID);
		boolean isdelete = false;
		try {
			isdelete = departmentService.deleteDepartment(d);
		} catch (Exception e) {
			log.info("删除部门信息时，出现异常");
			e.printStackTrace();
		}
		if (isdelete) {
			return "SUCCESS";
		}
		return "ERROR";
	}
}
