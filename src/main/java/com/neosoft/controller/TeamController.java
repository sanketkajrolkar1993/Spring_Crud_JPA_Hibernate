package com.neosoft.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neosoft.models.Sports;
import com.neosoft.models.Team;
import com.neosoft.service.ISportsService;
import com.neosoft.service.ITeamService;

@Controller
@RequestMapping(value="/team")
public class TeamController {
	
	@Autowired
	ITeamService teamService;
	
	@Autowired
	ISportsService sportsService;
	
	@RequestMapping(value="/getNewTeam",method=RequestMethod.GET)
	public String getNewSport(Model model) {
		List<Sports> sports = sportsService.getAllSports();
		if(sports != null) {
			model.addAttribute("sports",sports);
		}
		return "/Team/NewTeam";
	}
	
	@RequestMapping(value="/addNewTeam", method = RequestMethod.POST)
	public String createNewSport(@RequestParam String name,
			@RequestParam Long sportId,
			RedirectAttributes redirectAttributes) {
		Team team = new Team();
		team.setName(name);
		Sports sports = new Sports();
		sports.setId(sportId);
		team.setSports(sports);
		team.setCreatedOn(new Date());
		System.out.println("team: "+team.toString());
		teamService.saveTeam(team);
		redirectAttributes.addFlashAttribute("msg", "Team Added Successfully.");
		return "redirect:/";
	}
	
}
