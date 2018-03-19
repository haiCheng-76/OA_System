package com.example.oa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/pageControl")
public class PageControl {
	@RequestMapping(value = "/tomainpage.htm")
	public String toMainPage() {
		return "Main";
	}

	@RequestMapping(value = "/toCaringoList.htm")
	public String toCaringoList() {
		return "CarInfo/ListCarInfo";
	}
}
