package com.example.oa.service;

import java.util.List;

import com.example.oa.domain.Employee;

public interface EmployeeService {
	boolean addEmployee(Employee e);

	boolean deleteEmployee(Employee e);

	boolean updateEmployee(Employee e);

	Employee selectEmployeeById(int id);

	List<Employee> getallEmployee();

	boolean getuserByUPR(String account, String password, int role);

	boolean updatePassword(Employee e);
}
