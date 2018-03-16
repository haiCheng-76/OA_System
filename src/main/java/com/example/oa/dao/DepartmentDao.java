package com.example.oa.dao;

import java.util.List;

import com.example.oa.domain.Department;

public interface DepartmentDao {
	int addDepartment(Department department);

	int updateDepartment(Department department);

	int deleteDepartment(Department department);

	Department selectDepartmentById(int id);

	List<Department> getallDepartment();
}
