package com.example.oa.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.oa.domain.Employee;
import com.example.oa.service.EmployeeService;

@Controller
@RequestMapping(value = "/employeeControl")
public class EmployeeControl {
	private Logger log = Logger.getLogger(EmployeeControl.class);
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/isuer")
	@ResponseBody
	public String isUser(String account, String password, int role) {
		log.info("用户名:" + account + "密码" + password + ";角色" + role);
		String str = "";
		boolean hasuser = false;
		try {
			hasuser = employeeService.getuserByUPR(account, password, role);
		} catch (Exception e) {
			log.info("判断用户登陆失败时，网络出错！");
			e.printStackTrace();
		}
		if (hasuser) {
			str = "success";
		} else {
			str = "error";
		}
		return str;
	}

	@RequestMapping(value = "/forgetPassword.htm")
	public String forgetPassword(String account, int role) {
		String page = "";
		Employee e = new Employee();
		e.setEmployee_account(account);
		e.setRole(role);
		boolean isupdate = employeeService.updatePassword(e);
		if (isupdate) {
			page = "";
		} else {
			page = "";
		}
		return page;
	}

	@RequestMapping(value = "/deleteEmployee.htm")
	@ResponseBody
	public String deleteEmployee(Integer ID) {
		Employee e = new Employee();
		e.setEmployee_id(ID);
		boolean isdelete = false;
		try {
			isdelete = employeeService.deleteEmployee(e);
			log.info("删除用户成功");
		} catch (Exception e1) {
			log.info("删除用户时，网络出错！");
			e1.printStackTrace();
		}
		if (isdelete) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@RequestMapping(value = "/addEmployee")
	@ResponseBody
	public String addEmployee(Employee e) {
		boolean isadd = false;
		try {
			isadd = employeeService.addEmployee(e);
			log.info("添加用户成功");
		} catch (Exception e1) {
			log.info("添加用户时，网络出错！");
			e1.printStackTrace();
		}
		if (isadd) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	@RequestMapping(value = "/getallEmoloyee")
	@ResponseBody
	public List<Employee> getallEmoloyee() {
		List<Employee> listEmployee = null;
		try {
			listEmployee = employeeService.getallEmployee();
			log.info("获取所有员工信息成功");
		} catch (Exception e) {
			log.info("获取所有员工信息时网络出错！");
			e.printStackTrace();
		}
		return listEmployee;
	}

	@RequestMapping(value = "/getEmployeeById")
	@ResponseBody
	public Employee getEmployeeById(@RequestParam(value = "ID", required = false) Integer id) {
		Employee resp = new Employee();
		try {
			resp = employeeService.selectEmployeeById(id);
		} catch (Exception e) {
			log.info("获取编号为" + id + "的员工信息时出现异常，请稍后重试");
			e.printStackTrace();
		}
		return resp;
	}

	@RequestMapping(value = "/updateEmployee")
	@ResponseBody
	public String updateEmployee(Employee e) {
		boolean isupdate = false;
		try {
			isupdate = employeeService.updateEmployee(e);
		} catch (Exception e1) {
			log.info("修改员工信息时出现异常，请稍后重试");
			e1.printStackTrace();
		}
		if (isupdate) {
			return "SUCCESS";
		}
		return "ERROR";
	}
}
