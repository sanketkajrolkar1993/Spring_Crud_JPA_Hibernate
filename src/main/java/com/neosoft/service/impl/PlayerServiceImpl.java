package com.neosoft.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.models.Player;
import com.neosoft.repository.IPlayerRepository;
import com.neosoft.service.IPlayerService;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Autowired
	IPlayerRepository playerRepository;
	
	@Override
	public Player savePlayer(Player player) {
		return playerRepository.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	@Override
	public Optional<Player> getPlayerById(Long id) {
		return playerRepository.findById(id);
	}

}
