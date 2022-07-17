package com.exam;

public class Result {
	
	int Student_ID;
	String Student_Name;
	int Class_Name;
	String Student_Subject;
	int Total_Marks;
	int Passing_Marks;
	int Student_Marks;
	int Total_Student;
	public int getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getClass_Name() {
		return Class_Name;
	}
	public void setClass_Name(int class_Name) {
		Class_Name = class_Name;
	}
	public String getStudent_Subject() {
		return Student_Subject;
	}
	public void setStudent_Subject(String student_Subject) {
		Student_Subject = student_Subject;
	}
	public int getTotal_Marks() {
		return Total_Marks;
	}
	public void setTotal_Marks(int total_Marks) {
		Total_Marks = total_Marks;
	}
	public int getPassing_Marks() {
		return Passing_Marks;
	}
	public void setPassing_Marks(int passing_Marks) {
		Passing_Marks = passing_Marks;
	}
	public int getStudent_Marks() {
		return Student_Marks;
	}
	public void setStudent_Marks(int student_Marks) {
		Student_Marks = student_Marks;
	}
	public int getTotal_Student() {
		return Total_Student;
	}
	public void setTotal_Student(int total_Student) {
		Total_Student = total_Student;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int student_ID, String student_Name, int class_Name, String student_Subject, int total_Marks,
			int passing_Marks, int student_Marks, int total_Student) {
		super();
		Student_ID = student_ID;
		Student_Name = student_Name;
		Class_Name = class_Name;
		Student_Subject = student_Subject;
		Total_Marks = total_Marks;
		Passing_Marks = passing_Marks;
		Student_Marks = student_Marks;
		Total_Student = total_Student;
	}
	public void add(Result result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Result [Student_ID=" + Student_ID + ", Student_Name=" + Student_Name + ", Class_Name=" + Class_Name
				+ ", Student_Subject=" + Student_Subject + ", Total_Marks=" + Total_Marks + ", Passing_Marks="
				+ Passing_Marks + ", Student_Marks=" + Student_Marks + ", Total_Student=" + Total_Student + "]";
	}

}
