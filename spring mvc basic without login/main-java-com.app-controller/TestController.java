package com.app.controller;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")//optional but recommended cla level annotation to separate all testing relaated actions uder the test controller 

public class TestController {
	public TestController()
	{
		System.out.println("in ctor of "+getClass());
	}
	
	//add req handling method
	@GetMapping("/test1")
	/*
	 * entry in h.m (handler mapping bean)
	 * key : /test/test1 +method =get
	 * value: com.app.controller.TestController.testModelandview
	 */
	public ModelAndView testModelandview()
	{
		System.out.println("in test m n v");
		return new ModelAndView("/test/test1","server_timestamp",LocalDateTime.now());
		//avn resolved by vr bean: /wen-inf/views/test/test1.jsp
	}
	@GetMapping("/test2")
	public String testModelmap(Model map)//sc creayes an empty model map n injects it in the method 
	{
		System.out.println("in test model map"+map);//{}
		map.addAttribute("server_timestamp",LocalDateTime.now()).addAttribute("number_list",Arrays.asList(10,20,30,40));
		System.out.println("in test model map again"+map);
		return "/test/test1";
	}

}
