package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.Employee;

public interface EmployeeDao {
	int addEmployee(Employee e);

	int deleteEmployee(Employee e);

	int updateEmployee(Employee e);

	Employee selectEmployeeById(Employee e);

	List<Employee> getallEmployee();

	int getuserByUPR(Employee e);

	int forgetPassword(Employee e);
}
