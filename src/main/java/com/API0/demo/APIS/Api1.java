package com.API0.demo.APIS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api1 {
	
@RequestMapping(method = RequestMethod.GET , path = "/page1")
public String reply1() {
	return ("reply1");
}
@GetMapping(path = "/page2")
public random1 resply2() {
	return new random1("reply2");
}
@GetMapping(path = "/page3/{name}")
public random1 reply3(@PathVariable String name) {
	return new random1(String.format("reply3 ,%s " ,  name ));
	
}
@GetMapping(path = "/page4/{message}")
public String reply4(@PathVariable String message) {
	return(String.format("reply4 , %s", message));
	
}

}
