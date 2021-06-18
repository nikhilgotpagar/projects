package com.example.projectdemo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mytable")
public class User {
	
	@javax.persistence.Id
	private String firstname;
	private String lastname;
	private String username;
	private int id;
	private String password;
	private int age;
	
	
	public User() {
		
	}
	
	public User(String firstname, String lastname, String username, int id, String password,int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.id = id;
		this.age=age;
		this.password = password;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getid() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
