package com.API1.demo1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.API1.demo1.Model.Student;



@RestController
public class Contorller {

@Value("${app.name : Student Mangement System}")
private String appname;
@Value("${app.version}")
private String appversion;

@GetMapping(path="/about")
public String getappdetails() {
	return appname + " = " + appversion;
}

@GetMapping(path = "/student")
public String getstudents() {
	return "student details...";
}
@GetMapping(path = "/student/{id}")
public String getstudent(@PathVariable("id") int id) {
	return "getting student details of id = " + id;
}
@DeleteMapping(path = "/student/{id}")
public String deletestudent(@RequestParam("id") int id) {
	return "deleting student with id" + id;
}
@PostMapping(path="/student")
public String createstudent(@RequestBody Student std) {
	return "student info created " + std;
	
}
@PutMapping(path="/student/{id}")
public Student updatestudent(@PathVariable int id , @RequestBody Student std) {
		System.out.println("student with id =" + id + "is sucessfully updates");
	return std;
	
}


}
