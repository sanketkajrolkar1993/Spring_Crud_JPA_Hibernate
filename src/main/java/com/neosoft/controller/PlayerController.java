package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neosoft.models.Player;
import com.neosoft.models.Sports;
import com.neosoft.models.Team;
import com.neosoft.service.IPlayerService;
import com.neosoft.service.ISportsService;
import com.neosoft.service.ITeamService;

@Controller
@RequestMapping(value="/player")
public class PlayerController {
	
	@Autowired
	ISportsService sportsService;
	
	@Autowired
	ITeamService teamService;
	
	@Autowired
	IPlayerService playerService;
	
	String result = "";
	
	@RequestMapping(value="/getNewPlayer",method=RequestMethod.GET)
	public String getNewSport(Model model) {
		List<Team> teams = teamService.getAllTeams();
		List<Sports> sports = sportsService.getAllSports();
		model.addAttribute("teams",teams);
		model.addAttribute("sports",sports);
		return "/Player/NewPlayer";
	}
	
	@RequestMapping(value="/addNewPlayer", method = RequestMethod.POST)
	public String createNewSport(@RequestParam String name,
			@RequestParam int jersyNo,
			@RequestParam Long teamId,
			RedirectAttributes redirectAttributes) {
		Player player = new Player();
		player.setName(name);
		player.setJersyNo(jersyNo);
		
		Team team = new Team();
		team.setId(teamId);
		player.setTeam(team);
		
		playerService.savePlayer(player);
		redirectAttributes.addFlashAttribute("msg", "Player Added Successfully.");
		return "redirect:/";
	}
	
	@RequestMapping(value="/getTeamFromSport", method=RequestMethod.POST)
	public @ResponseBody String getTeamFromSport(
			@RequestBody String sports_id) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Team> team = teamService.getTeamBySportID(Long.parseLong(sports_id));
		result = objectMapper.writeValueAsString(team);
		System.out.println(result);
		return result;
	}
	
}
