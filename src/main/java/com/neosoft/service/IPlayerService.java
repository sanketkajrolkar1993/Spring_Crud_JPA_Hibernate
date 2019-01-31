package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import com.neosoft.models.Player;

public interface IPlayerService {
	
	public Player savePlayer(Player player);
	
	public List<Player> getAllPlayers();
	
	public Optional<Player> getPlayerById(Long id);
	
}
