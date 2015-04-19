package com.counciler.utils;

import java.util.*;

import com.counciler.beans.*;

public interface CouncilerUtils {
	
	public boolean registerStudent(Student student);
	public List<Course> getAllCourses();
	public Course getCourse(int C_id);
	public List<Student> getStudents();
	public boolean incrementCapacity(int c_id,int no_seats);

	public Counciler login(String uname,String upass);
	
	
}
