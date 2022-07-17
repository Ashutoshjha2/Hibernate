package com.bus.entity;

public class User {
	private String id;
	private String name;
	private String password;
	private String role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String name, String password, String role) {
		super();
		this.id = id;
		this.name = name;
	
		this.password = password;
		this.role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name  + ", password=" + password + ", role=" + role
				+ "]";
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
	
	
	

}
