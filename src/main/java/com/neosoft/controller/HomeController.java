package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neosoft.service.ISportsService;

@Controller
public class HomeController {

	@Autowired
	ISportsService sportsService;
	
	@RequestMapping(value="/")
	public String getHome(Model model) {
		String message= (String) model.asMap().get("msg");
		model.addAttribute("message",message);
		return "/Home/Home";
	}
	
}
