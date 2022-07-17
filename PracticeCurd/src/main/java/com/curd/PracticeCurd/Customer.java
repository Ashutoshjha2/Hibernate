package com.curd.PracticeCurd;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@Column(name = "customer_id")
	private int customer_id;
	private String Name;
	private String mobile_No;
	private String email_id;
	@OneToMany(mappedBy = "customer")
	private List<Customer_Address> address;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile_No() {
		return mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public List<Customer_Address> getAddress() {
		return address;
	}

	public void setAddress(List<Customer_Address> address) {
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customer_id, String name, String mobile_No, String email_id, List<Customer_Address> address) {
		super();
		this.customer_id = customer_id;
		Name = name;
		this.mobile_No = mobile_No;
		this.email_id = email_id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", Name=" + Name + ", mobile_No=" + mobile_No + ", email_id="
				+ email_id + ", address=" + address + "]";
	}

}
