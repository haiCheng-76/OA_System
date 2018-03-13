package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.Department;

public interface DepartmentDao {
	boolean addDepartment(Department department);

	boolean updateDepartment(Department department);

	boolean deleteDepartment(Department department);

	Department selectDepartmentById(int id);

	List<Department> getallDepartment();
}
