package com.counciler.beans;

public class Counciler {
	
	private int Cu_id;
	private String Cu_name;
	private String Cu_username;
	private int  Cu_password;
	private String Cu_email;
	
	public Counciler(String cu_name, String cu_username, int cu_password,
			String cu_email) {
		super();
		Cu_name = cu_name;
		Cu_username = cu_username;
		Cu_password = cu_password;
		Cu_email = cu_email;
	}
	public Counciler(){}

	public int getCu_id() {
		return Cu_id;
	}

	public void setCu_id(int cu_id) {
		Cu_id = cu_id;
	}

	public String getCu_name() {
		return Cu_name;
	}

	public void setCu_name(String cu_name) {
		Cu_name = cu_name;
	}

	public String getCu_username() {
		return Cu_username;
	}

	public void setCu_username(String cu_username) {
		Cu_username = cu_username;
	}

	public int getCu_password() {
		return Cu_password;
	}

	public void setCu_password(int cu_password) {
		Cu_password = cu_password;
	}

	public String getCu_email() {
		return Cu_email;
	}

	public void setCu_email(String cu_email) {
		Cu_email = cu_email;
	}
	
	public String toString(){
		return Cu_name;
		
	}

}
