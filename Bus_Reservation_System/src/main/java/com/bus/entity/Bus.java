package com.bus.entity;
public class Bus {
private int BusNo;
private String BusName;
private String ACBus;
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
public String getBusName() {
	return BusName;
}
public void setBusName(String busName) {
	BusName = busName;
}
public String getACBus() {
	return ACBus;
}
public void setACBus(String aCBus) {
	ACBus = aCBus;
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
public Bus() {
	super();
	// TODO Auto-generated constructor stub
}
public Bus(int busNo, String busName, String aCBus, String busSource, String busDestination, String busFare,
		String busSeat) {
	super();
	BusNo = busNo;
	BusName = busName;
	ACBus = aCBus;
	BusSource = busSource;
	BusDestination = busDestination;
	BusFare = busFare;
	BusSeat = busSeat;
}
@Override
public String toString() {
	return "Bus [BusNo=" + BusNo + ", BusName=" + BusName + ", ACBus=" + ACBus + ", BusSource=" + BusSource
			+ ", BusDestination=" + BusDestination + ", BusFare=" + BusFare + ", BusSeat=" + BusSeat + "]";
}

}