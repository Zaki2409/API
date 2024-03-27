package com.API1.demo1.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.API1.demo1.Model.Student;

@Repository
public interface stdrepo extends JpaRepository<Student, Long> {

}
