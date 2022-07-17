package com.trainReservationSystem;

public class Booking {
private int pnr;
private String Name;
private String Email ;
private String Address;
private String State;
private long Mobile;
public int getPnr() {
	return pnr;
}
public void setPnr(int pnr) {
	this.pnr = pnr;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
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
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public Booking(int pnr, String name, String email, String address, String state, long mobile) {
	super();
	this.pnr = pnr;
	Name = name;
	Email = email;
	Address = address;
	State = state;
	Mobile = mobile;
}
@Override
public String toString() {
	return "Booking [pnr=" + pnr + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", State=" + State
			+ ", Mobile=" + Mobile + "]";
}

}
