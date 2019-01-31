package com.neosoft.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neosoft.models.Sports;
import com.neosoft.service.ISportsService;

@Controller
@RequestMapping(value="/sport")
public class SportsController {

	@Autowired
	ISportsService sportsService;
	
	@RequestMapping(value="/getNewSport",method=RequestMethod.GET)
	public String getNewSport() {
		return "/Sports/NewSport";
	}
	
	@RequestMapping(value="/addNewSport", method = RequestMethod.POST)
	public String createNewSport(@RequestParam String name,
			RedirectAttributes redirectAttributes) {
		Sports sports = new Sports();
		sports.setName(name);
		sports.setCreatedOn(new Date());
		sportsService.saveSport(sports);
		redirectAttributes.addFlashAttribute("msg", "Sports Added Successfully.");
		return "redirect:/";
	}
	
}
