package com.API0.demo.Users;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	@DeleteMapping(path="/users/{id}")
	public void delspecid(@PathVariable int id ) {
		  service.Delete(id);
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Object> createuser(@RequestBody Users user) {
		Users saved = service.save(user);
		URI location =ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(saved.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
} 
