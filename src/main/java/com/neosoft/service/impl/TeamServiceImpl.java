package com.neosoft.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.models.Team;
import com.neosoft.repository.ITeamRepository;
import com.neosoft.service.ITeamService;

@Service
public class TeamServiceImpl implements ITeamService {

	@Autowired
	ITeamRepository teamRepository;
	
	@Override
	public Team saveTeam(Team team) {
		return teamRepository.save(team);
	}

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

	@Override
	public Optional<Team> getTeamById(Long id) {
		return teamRepository.findById(id);
	}

	@Override
	public List<Team> getTeamBySportID(Long sports_id) {
		return teamRepository.getTeamBySportID(sports_id);
	}

}
