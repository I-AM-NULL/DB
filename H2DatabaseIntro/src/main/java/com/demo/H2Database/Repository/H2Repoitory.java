package com.demo.H2Database.Repository;

import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.H2Database.Entity.Item;

@Repository
public interface H2Repoitory extends JpaRepository<Item, Integer>{
	
	

}
