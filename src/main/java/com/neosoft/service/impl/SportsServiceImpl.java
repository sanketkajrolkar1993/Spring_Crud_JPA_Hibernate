package com.neosoft.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.models.Sports;
import com.neosoft.repository.ISportsRepository;
import com.neosoft.service.ISportsService;

@Service
public class SportsServiceImpl implements ISportsService {

	@Autowired
	ISportsRepository sportsRepository;
	
	@Override
	public Sports saveSport(Sports sports) {
		Sports result= sportsRepository.save(sports);
		return result;
	}

	@Override
	public List<Sports> getAllSports() {
		return sportsRepository.findAll();
	}

	@Override
	public Optional<Sports> getSportsById(Long id) {
		Optional<Sports> sports = sportsRepository.findById(id);
		return sports;
	}

}
