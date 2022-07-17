package com.bus.entity;

public class userdetails {
	private int BusNo;
	private String BusSource;
	private String BusDestination;
	private String BusFare;
	private String BusSeat;
	public int getBusNo() {
		return BusNo;
	}
	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	public String getBusSource() {
		return BusSource;
	}
	public void setBusSource(String busSource) {
		BusSource = busSource;
	}
	public String getBusDestination() {
		return BusDestination;
	}
	public void setBusDestination(String busDestination) {
		BusDestination = busDestination;
	}
	public String getBusFare() {
		return BusFare;
	}
	public void setBusFare(String busFare) {
		BusFare = busFare;
	}
	public String getBusSeat() {
		return BusSeat;
	}
	public void setBusSeat(String busSeat) {
		BusSeat = busSeat;
	}
	public userdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userdetails(int busNo, String busSource, String busDestination, String busFare, String busSeat) {
		super();
		BusNo = busNo;
		BusSource = busSource;
		BusDestination = busDestination;
		BusFare = busFare;
		BusSeat = busSeat;
	}
	@Override
	public String toString() {
		return "userdetails [BusNo=" + BusNo + ", BusSource=" + BusSource + ", BusDestination=" + BusDestination
				+ ", BusFare=" + BusFare + ", BusSeat=" + BusSeat + "]";
	}
	
}
