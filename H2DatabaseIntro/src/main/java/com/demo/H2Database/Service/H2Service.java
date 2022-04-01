package com.demo.H2Database.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.H2Database.Entity.Item;
import com.demo.H2Database.Repository.H2Repoitory;

@Service
public class H2Service {
	
	@Autowired
	H2Repoitory repoitory;
	
	

	public List<Item> getallfromRepository() {
		// TODO Auto-generated method stub
		return repoitory.findAll();
	}

}
