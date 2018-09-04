package com.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.testService;

@Controller
public class testController {
	
	@Resource(name="testService")
	private testService testService;
	
	@RequestMapping(value="hello.do")
	public String mainPage(ModelMap model) throws Exception{
		System.out.println("mainpage()");
		String str = testService.addString("gg");
		
		List<?> testList = testService.selectAll();
		
		model.addAttribute("resultList", testList);
		model.addAttribute("str", str);
		
		return "hello";
	}

}
