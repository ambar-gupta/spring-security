package com.springboot.springsecurity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="security_user")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String role;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String username, String password, String role, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.email = email;
	}
	public User() {
		super();
	}
	
	
}
