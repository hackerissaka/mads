package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.Login;

@Repository
public interface LoginDao extends JpaRepository<Login, Integer> {
	
	@Query("Select l from Login l where l.id=(:id)")
	Login getUserDetails(@Param(value="id")int id);
	
	
}
