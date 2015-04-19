package com.counciler.beans;

public class Course {
	
	public Course(String c_name, int c_duration, int c_fee, int c_no_ofseats) {
		super();
		C_name = c_name;
		C_duration = c_duration;
		C_fee = c_fee;
		C_no_ofseats = c_no_ofseats;
	}
	
	public Course(){}

	private int C_id;
	private String C_name;
	private int C_duration;
	private int C_fee;
	private int C_no_ofseats;
	
	

	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		C_id = c_id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public int getC_duration() {
		return C_duration;
	}

	public void setC_duration(int c_duration) {
		C_duration = c_duration;
	}

	public int getC_fee() {
		return C_fee;
	}

	public void setC_fee(int c_fee) {
		C_fee = c_fee;
	}

	public int getC_no_ofseats() {
		return C_no_ofseats;
	}

	public void setC_no_ofseats(int c_no_ofseats) {
		C_no_ofseats = c_no_ofseats;
	}
	
	public String toString(){
		return C_name;
	}

}
