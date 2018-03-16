package com.example.oa.service;

import java.util.List;

import com.example.oa.domain.Borrow_car;

public interface BorrowCarService {
	boolean addBorrowedInfo(Borrow_car borrow_car);

	boolean updateBorrowInfo(Borrow_car borrow_car);

	boolean deleteBorrowInfo(Borrow_car borrow_car);

	List<Borrow_car> getallBorrowInfo();
}
