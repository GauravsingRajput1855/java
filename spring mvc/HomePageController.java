package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController()
	{
		System.out.println("in ctor of"+getClass());;
	}
	@RequestMapping("/")
	public String showHomePage()
	{
		System.out.println("in show page ");
		return "/index";
	}
}