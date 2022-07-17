package com.bus.entity;

public class Truck {
private int truck_no;
private String truck_name;
private int truck_price;
public int getTruck_no() {
	return truck_no;
}
public void setTruck_no(int truck_no) {
	this.truck_no = truck_no;
}
public String getTruck_name() {
	return truck_name;
}
public void setTruck_name(String truck_name) {
	this.truck_name = truck_name;
}
public int getTruck_price() {
	return truck_price;
}
public void setTruck_price(int truck_price) {
	this.truck_price = truck_price;
}
public Truck(int truck_no, String truck_name, int truck_price) {
	super();
	this.truck_no = truck_no;
	this.truck_name = truck_name;
	this.truck_price = truck_price;
}
public Truck() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Truck [truck_no=" + truck_no + ", truck_name=" + truck_name + ", truck_price=" + truck_price + "]";
}

}
