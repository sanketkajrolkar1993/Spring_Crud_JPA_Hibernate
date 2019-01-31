package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import com.neosoft.models.Team;

public interface ITeamService {
	
	public Team saveTeam(Team team);
	
	public List<Team> getAllTeams();
	
	public Optional<Team> getTeamById(Long id);
	
	public List<Team> getTeamBySportID(Long sports_id);
}
