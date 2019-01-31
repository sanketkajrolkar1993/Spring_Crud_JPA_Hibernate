/**
 * 
 */
package com.neosoft.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.models.Sports;

/**
 * @author webwerks
 *
 */
@Repository
@Transactional
public interface ISportsRepository extends JpaRepository<Sports, Long>{

}
