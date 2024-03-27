package com.API1.demo1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table (name = "std")

public class Student {

		@GeneratedValue(strategy=GenerationType.AUTO)
		@Id
		@Column(name = "id")
		private long id;
	
		@Column(name = "name")
	     private String name; 
		
		@Column(name = "email")
		 private String Email;
		@Column(name = "department")
		 private String Department ;
		@Column(name = "mobile")
		 private int mobile ;
		@Column(name = "location")
		 private String location;
		 
		 
		 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	
	
	
}
