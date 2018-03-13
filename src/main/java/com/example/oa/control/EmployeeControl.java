package com.example.oa.control;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.oa.domain.Employee;
import com.example.oa.service.EmployeeService;

@Controller
@RequestMapping(value = "/login")
public class EmployeeControl {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/isuer.htm")
	@ResponseBody
	public String isUser(String account, String password, int role) {
		String str = "";
		boolean hasuser = employeeService.getuserByUPR(account, password, role);
		System.out.println(hasuser);
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
	public String deleteEmployee() {
		String msg = "";
		Employee e = new Employee();
		boolean isdelete = employeeService.deleteEmployee(e);
		if (isdelete) {
			msg = "";
		} else {
			msg = "";
		}
		return msg;
	}

	@RequestMapping(value = "/addEmployee.htm")
	public String addEmployee() {
		String msg = "";
		Employee e = new Employee();
		boolean isadd = employeeService.addEmployee(e);
		if (isadd) {
			msg = "";
		} else {
			msg = "";
		}
		return msg;
	}
}
