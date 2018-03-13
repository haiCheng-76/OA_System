package com.example.oa.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.oa.dao.FileDao;
import com.example.oa.domain.File;
import com.example.oa.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	@Autowired
	private FileDao fileDao;

	@Override
	public boolean addFile(File file) {
		int addnum = fileDao.addFile(file);
		return addnum == 1 ? true : false;
	}

	@Override
	public boolean deleteFile(File file) {
		int delnum = fileDao.deleteFile(file);
		return delnum == 1 ? true : false;
	}

	@Override
	public boolean updateFile(File file) {
		int updatenum = fileDao.updateFile(file);
		return updatenum == 1 ? true : false;
	}

	@Override
	public File selectFileById(File file) {
		return fileDao.selectFileById(file);
	}

	@Override
	public List<File> getallFile() {
		List<File> llistfile = fileDao.getallFile();
		return llistfile;
	}

}
