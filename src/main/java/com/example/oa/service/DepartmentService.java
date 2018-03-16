package com.example.oa.service;

import java.util.List;

import com.example.oa.domain.Department;

public interface DepartmentService {
	boolean addDepartment(Department department);

	boolean updateDepartment(Department department);

	boolean deleteDepartment(Department department);

	Department selectDepartmentById(int id);

	List<Department> getallDepartment();
}
