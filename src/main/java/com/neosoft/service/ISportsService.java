/**
 * 
 */
package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import com.neosoft.models.Sports;

/**
 * @author webwerks
 *
 */
public interface ISportsService {

	public Sports saveSport(Sports sports);
	
	public List<Sports> getAllSports();
	
	public Optional<Sports> getSportsById(Long id);
	
}
