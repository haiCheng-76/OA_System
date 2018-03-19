package com.example.oa.dao;

import java.util.List;
import com.example.oa.domain.Borrow_car;

public interface Borrow_CarDao {
	int addBorrowedInfo(Borrow_car borrow_car);

	int updateBorrowInfo(Borrow_car borrow_car);

	int deleteBorrowInfo(Borrow_car borrow_car);

	List<Borrow_car> getallBorrowInfo();
}
