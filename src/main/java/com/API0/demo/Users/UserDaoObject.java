package com.API0.demo.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import java.util.function.Predicate;

@Component
public class UserDaoObject {

	private static List<Users> users = new ArrayList<>();
	
	private static int UC=0;
	static {
		users.add(new Users(++UC , "zaki" , LocalDate.now().minusYears(30)));
		users.add(new Users(++UC , "khan" , LocalDate.now().minusYears(25)));
		users.add(new Users(++UC , "Mohammed" , LocalDate.now().minusYears(20)));
	}
	public List<Users> findall() {
		return users;
	}
	public Users save(Users user) {
		user.setId(++UC);
		users.add(user);
		return user;
		
	}
	
	public Users findone(int id) {
		Predicate<? super Users > predicate = users -> users.getId().equals(id);
			return users.stream().filter(predicate).findFirst().get();
	}
	
}
