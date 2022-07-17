package com.exam;

public class Registration {
	int ID;
	String Name;
	String FathersName;
	String Email ;
	String Address;
	String City;
	String State;
	long Mobile;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFathersName() {
		return FathersName;
	}
	public void setFathersName(String fathersName) {
		FathersName = fathersName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int iD, String name, String fathersName, String email, String address, String city,
			String state, long mobile) {
		super();
		ID = iD;
		Name = name;
		FathersName = fathersName;
		Email = email;
		Address = address;
		City = city;
		State = state;
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Registration [ID=" + ID + ", Name=" + Name + ", FathersName=" + FathersName + ", Email=" + Email
				+ ", Address=" + Address + ", City=" + City + ", State=" + State + ", Mobile=" + Mobile + "]";
	}
	
}