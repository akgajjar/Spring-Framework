package com.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class employeecontroller {

	
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index";
	}
	
	
}
