package com.API1.demo1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contorller {
	
@GetMapping(path = "/test1")
public String test1() {
	return "test1";
}

}
