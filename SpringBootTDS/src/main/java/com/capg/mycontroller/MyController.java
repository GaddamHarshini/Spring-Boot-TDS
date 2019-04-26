package com.capg.mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dto.TdsMaster;
import com.capg.exception.UserNotFoundException;
import com.capg.service.Tds;

@RestController
@RequestMapping("/user")
public class MyController {
	
	@Autowired
	Tds Tds1;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@GetMapping("/tds/{id}")
	public TdsMaster getByPid(@PathVariable int id) {
		TdsMaster tdsMaster=Tds1.getByPid(id);
		if(tdsMaster==null) {
			throw new UserNotFoundException("ID Not Found Wrong ID : "+id);
		}
		else
			return tdsMaster;
	}
	
	

}














