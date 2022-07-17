package com.criteria;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.sql.*;
@Entity 
@Cacheable
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY)
public class Student {

@Id	
private int id;
private String name;
private String city;
private certificate certi;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
public certificate getCerti() {
	return certi;
}
public void setCerti(certificate certi) {
	this.certi = certi;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}

}
