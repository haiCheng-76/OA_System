package com.example.oa.control;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.example.oa.service.FileService;

@Controller
@RequestMapping(value = "/fileControl")
public class FileControl {
	@Autowired
	private FileService fileservice;
	private Logger log = Logger.getLogger(FileControl.class);

	@RequestMapping(value = "/addFile")
	@ResponseBody
	public String addFile(@RequestParam("file") CommonsMultipartFile uploadFile, HttpServletRequest request,
			@RequestParam(value = "uploader") Integer uploader) {
		log.info("文件：" + uploadFile + "uploader:" + uploader);
		com.example.oa.domain.File f = new com.example.oa.domain.File();
		String filename = uploadFile.getOriginalFilename();
		String path = request.getSession().getServletContext().getRealPath("uploadfile");
		if (request instanceof MultipartHttpServletRequest) {
			String filepath = path + File.separator + filename;
			f.setFile_location(filepath);
			f.setFilename(filename);
			f.setFilesize(uploadFile.getSize());
			f.setEmployee_id(uploader);
			log.info("文件路径：" + path);
			log.info("名字" + uploadFile.getOriginalFilename());
			log.info(uploadFile.getSize());
			File file = new File(path, filename);
			if (!file.exists()) {
				file.mkdirs();
			}
			try {
				uploadFile.transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
				return "ERROR";
			} catch (IOException e) {
				e.printStackTrace();
				return "ERROR";
			}
			boolean isadded = fileservice.addFile(f);
			if (isadded) {
				return "SUCCESS";
			}
			return "ERROR";
		}
		return "ERROR";
	}

	@RequestMapping(value = "/getAllFile")
	@ResponseBody
	public List<com.example.oa.domain.File> getAllFile() {
		List<com.example.oa.domain.File> listFile = null;
		try {
			listFile = fileservice.getallFile();
		} catch (Exception e) {
			log.info("请求获取所有文件时，出现异常，请稍后重试");
			e.printStackTrace();
		}
		return listFile;
	}

	@RequestMapping(value = "/getFileById")
	@ResponseBody
	public com.example.oa.domain.File getFileById(Integer ID) {
		com.example.oa.domain.File file = new com.example.oa.domain.File();
		file.setFileid(ID);
		com.example.oa.domain.File f = fileservice.selectFileById(file);
		return f;
	}

	@RequestMapping(value = "/deleteFile")
	@ResponseBody
	public String deleteFile(Integer ID) {
		boolean isdelete = false;
		String location = "";
		try {
			location = fileservice.getFileLocation(ID);
		} catch (Exception e) {
			log.info("请求文件路径时出现异常，请稍后重试");
			e.printStackTrace();
		}
		File f = null;
		try {
			f = new File(location);
		} catch (Exception e) {
			log.info("删除文件时出现错误");
			e.printStackTrace();
		}
		if (f.exists() && f.isFile()) {
			isdelete = f.delete();
		}
		com.example.oa.domain.File file = new com.example.oa.domain.File();
		file.setFileid(ID);
		boolean isdeleteFile = fileservice.deleteFile(file);
		if (isdelete && isdeleteFile ) {
			return "SUCCESS";
		}
		return "ERROR";
	}
}
