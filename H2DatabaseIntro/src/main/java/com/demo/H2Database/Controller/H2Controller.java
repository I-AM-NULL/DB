package com.demo.H2Database.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.H2Database.Entity.Item;
import com.demo.H2Database.Service.H2Service;

@RestController
@RequestMapping("/H2")
public class H2Controller {
	
	@Autowired
	H2Service service;

	
	@GetMapping("getall")
	public List<Item> getall(){
		return service.getallfromRepository();
		
}

}