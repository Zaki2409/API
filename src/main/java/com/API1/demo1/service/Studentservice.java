package com.API1.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.API1.demo1.Model.Student;


@Service
public interface Studentservice {

	List<Student> getstddetails() ;
	
}
