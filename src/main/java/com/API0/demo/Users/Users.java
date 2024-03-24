package com.API0.demo.Users;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Users {
	 private Integer id;
	 private String name;
	 private LocalDate birthday;
	public Users(Integer id, String name, LocalDate birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}
	  static void removeIf(Predicate<? super Users> predicate) {
		// TODO Auto-generated method stub
		
	}
	
}
