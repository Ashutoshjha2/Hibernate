package com.trainReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Train {
private int train_no;
private String train_name;
private String train_coach;
private int train_fare;
private String train_source;
private String train_destination;
public int getTrain_no() {
	return train_no;
}
public void setTrain_no(int train_no) {
	this.train_no = train_no;
}
public String getTrain_name() {
	return train_name;
}
public void setTrain_name(String train_name) {
	this.train_name = train_name;
}
public String getTrain_coach() {
	return train_coach;
}
public void setTrain_coach(String train_coach) {
	this.train_coach = train_coach;
}
public int getTrain_fare() {
	return train_fare;
}
public void setTrain_fare(int train_fare) {
	this.train_fare = train_fare;
}
public String getTrain_source() {
	return train_source;
}
public void setTrain_source(String train_source) {
	this.train_source = train_source;
}
public String getTrain_destination() {
	return train_destination;
}
public void setTrain_destination(String train_destination) {
	this.train_destination = train_destination;
}
public Train() {
	super();
	// TODO Auto-generated constructor stub
}
public Train(int train_no, String train_name, String train_coach, int train_fare, String train_source,
		String train_destination) {
	super();
	this.train_no = train_no;
	this.train_name = train_name;
	this.train_coach = train_coach;
	this.train_fare = train_fare;
	this.train_source = train_source;
	this.train_destination = train_destination;
}
@Override
public String toString() {
	return "Train [train_no=" + train_no + ", train_name=" + train_name + ", train_coach=" + train_coach
			+ ", train_fare=" + train_fare + ", train_source=" + train_source + ", train_destination="
			+ train_destination + "]";
}
public List<Train>TrainList () {
List<Train> t = new ArrayList<Train>();
t.add(new Train(101, "Rajdhani", "AC", 5000, "Patna", "Delhi"));
t.add(new Train(102, "Satabdi", "NON-AC", 3000, "Patna", "Delhi"));
t.add(new Train(103, "Garibrath", "AC", 4000, "Chitrakoot", "Lucknow"));
t.add(new Train(104, "Intercity", "NON-AC", 2500, "Chitrakoot", "Lucknow"));
return t;
}

}
