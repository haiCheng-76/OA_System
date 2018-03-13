package com.example.oa.dao;

import java.util.List;
import com.example.oa.domain.File;

public interface FileDao {
	int addFile(File file);

	int deleteFile(File file);

	int updateFile(File file);

	File selectFileById(File file);

	List<File> getallFile();
}
