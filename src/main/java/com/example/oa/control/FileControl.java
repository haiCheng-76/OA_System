package com.example.oa.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.oa.domain.File;
import com.example.oa.service.FileService;

@Controller
@RequestMapping(value = "/fileControl")
public class FileControl {
	@Autowired
	private FileService fileService;

	@RequestMapping(value = "/getallFileInfo.htm",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<File> getallFileInfo() {
		System.out.println(fileService.getallFile().size());
		return fileService.getallFile();
	}
}
