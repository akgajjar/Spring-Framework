package com.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.dao.employeedao;

@Controller
public class employeecontroller {

	@Autowired
	employeedao dao;
	
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index";
	}
	
	
}
