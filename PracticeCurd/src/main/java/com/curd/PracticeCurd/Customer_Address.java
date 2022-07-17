package com.curd.PracticeCurd;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Customer_Address {
	@Id
	@Column(name = "customer_Address")
private String Address;
private String State;
private String City;
private int Pin_Code;
@ManyToOne
private Customer customer;

public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getPin_Code() {
	return Pin_Code;
}
public void setPin_Code(int pin_Code) {
	Pin_Code = pin_Code;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Customer_Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer_Address(String address, String state, String city, int pin_Code, Customer customer) {
	super();
	Address = address;
	State = state;
	City = city;
	Pin_Code = pin_Code;
	this.customer = customer;
}
@Override
public String toString() {
	return "Customer_Address [Address=" + Address + ", State=" + State + ", City=" + City + ", Pin_Code=" + Pin_Code
			+ ", customer=" + customer + "]";
}

}
