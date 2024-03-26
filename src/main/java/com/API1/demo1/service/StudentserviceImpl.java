package com.API1.demo1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.API1.demo1.Model.Student;


@Service
public class StudentserviceImpl implements Studentservice {

	private static List<Student> hardcodelist = new ArrayList<> () ;
	
	static {
		Student s = new Student();
		s.setName("Mohammed");
		s.setId(526);
		s.setEmail("mohammedkhanzaki@gmail.com");
		s.setDepartment("CSE");
		s.setMobile(668);
		s.setLocation("vanasthalipuram");
		hardcodelist.add(s);
		
		Student s1 = new Student();
		s1.setName("Zaheer");
		s1.setId(527);
		s1.setEmail("mohammedkhanzaheer@gmail.com");
		s1.setDepartment("IT");
		s1.setMobile(663);
		s1.setLocation("secunderabad");
		hardcodelist.add(s1);
		
	}
	
	@Override
	public List<Student> getstddetails() {
		// TODO Auto-generated method stub
		return hardcodelist;
	}

}
