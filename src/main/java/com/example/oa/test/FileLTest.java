package com.example.oa.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.oa.domain.File;
import com.example.oa.service.FileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:root-context.xml", "classpath*:servlet-context.xml" })
public class FileLTest {
	@Autowired
	private FileService fileService;

	@Test
	public void testGetallFileInfo() {
		List<File> listfile = fileService.getallFile();
		assertEquals(5, listfile.size());
	}

}
