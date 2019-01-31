package com.neosoft.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.models.Player;

@Repository
@Transactional
public interface IPlayerRepository extends JpaRepository<Player, Long> {

}
