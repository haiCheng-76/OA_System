package com.example.oa.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oa.dao.DepartmentDao;
import com.example.oa.domain.Department;
import com.example.oa.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public boolean addDepartment(Department department) {
		int addnum = departmentDao.addDepartment(department);
		return addnum == 1 ?true :false;
	}

	@Override
	public boolean updateDepartment(Department department) {
		int updatenum = departmentDao.updateDepartment(department);
		return updatenum == 1 ? true :false;
	}

	@Override
	public boolean deleteDepartment(Department department) {
		int deletenum = departmentDao.deleteDepartment(department);
		return deletenum == 1 ? true :false;
	}

	@Override
	public Department selectDepartmentById(int id) {
		return departmentDao.selectDepartmentById(id);
	}

	@Override
	public List<Department> getallDepartment() {
		return departmentDao.getallDepartment();
	}

}
