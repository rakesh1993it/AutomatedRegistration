package com.counciler.beans;

public class Student {
	
	
	private int S_id;
	private String S_name;
	private String S_address;
	private String S_email;
	private int S_contact;
	private Course course;
	
	public Student(String s_name, String s_address, String s_email,
			int s_contact, Course course ) {
		super();
		S_name = s_name;
		S_address = s_address;
		S_email = s_email;
		S_contact = s_contact;
		this.course=course;
	}
	public Student(){}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public String getS_address() {
		return S_address;
	}

	public void setS_address(String s_address) {
		S_address = s_address;
	}

	public String getS_email() {
		return S_email;
	}

	public void setS_email(String s_email) {
		S_email = s_email;
	}

	public int getS_contact() {
		return S_contact;
	}

	public void setS_contact(int s_contact) {
		S_contact = s_contact;
	}
	
	public Course getCourse(){
		return course;
	}
	
	public void setCourse(Course course){
		this.course=course;
	}
	
	public String toString(){
		return S_name;
	}
	

}
