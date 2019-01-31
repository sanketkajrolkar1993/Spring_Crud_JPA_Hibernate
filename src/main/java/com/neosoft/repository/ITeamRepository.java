package com.neosoft.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neosoft.models.Team;

@Repository
@Transactional
public interface ITeamRepository extends JpaRepository<Team, Long> {
	
	@Query(value="select * from team where sports_id = :sports_id",nativeQuery = true)
	public List<Team> getTeamBySportID(@Param("sports_id")Long sports_id);
	
}
