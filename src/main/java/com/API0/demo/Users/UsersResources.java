package com.API0.demo.Users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResources {
	private UserDaoObject service;

	public UsersResources(UserDaoObject service) {
		this.service = service;
	}
	@GetMapping(path="/users")
	public List<Users> getall(){
		return service.findall();
	}
	
	
	@GetMapping(path="/users/{id}")
	public Users getspecid(@PathVariable int id ) {
		return service.findone(id); 
	}
	
	@PostMapping(path="/users")
	public Users createuser(@RequestBody Users user) {
		return service.save(user);			
	}
} 
