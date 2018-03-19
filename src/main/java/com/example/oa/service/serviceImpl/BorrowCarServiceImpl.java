package com.example.oa.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.oa.dao.Borrow_CarDao;
import com.example.oa.domain.Borrow_car;
import com.example.oa.service.BorrowCarService;


@Service
public class BorrowCarServiceImpl implements BorrowCarService {
	@Autowired
	private Borrow_CarDao borrowCarDao;

	@Override
	public boolean addBorrowedInfo(Borrow_car borrow_car) {
		int addnum = borrowCarDao.addBorrowedInfo(borrow_car);
		return addnum == 1 ?true :false;
	}

	@Override
	public boolean updateBorrowInfo(Borrow_car borrow_car) {
		int updatenum = borrowCarDao.updateBorrowInfo(borrow_car);
		return updatenum == 1 ? true : false;
	}

	@Override
	public boolean deleteBorrowInfo(Borrow_car borrow_car) {
		int deletenum = borrowCarDao.deleteBorrowInfo(borrow_car);
		return deletenum == 1 ?true :false;
	}

	@Override
	public List<Borrow_car> getallBorrowInfo() {
		return borrowCarDao.getallBorrowInfo();
	}

}
