package com.counciler.test;

import java.util.List;

import com.counciler.beans.*;
import com.counciler.utils.*;



public class Test {
	
	public static void main(String[] args) {
		
	CouncilerUtils cu = new CouncilerUtilsImpl();
		
		List<Course> clist = cu.getAllCourses();
		
		Course c = clist.get(1);
		
		Student s = new Student("Ramen","kolkata","ramen@gmail.com",6887680,c);
		//Course c = new Course("JEE8",23,6000,50);
		CouncilerUtils util = new CouncilerUtilsImpl();
		
		if(util.registerStudent(s)){
			
			System.out.println("Connection Succesfull...");
		}else{
			System.out.println("Connection failed.");
			
		} 
	
	/*	if(util.incrementCapacity(course)){
			System.out.println("Done...!");
		}else{
			System.out.println("ha ha ha");
		}
		*/
 
		//Course  c = new CouncilerUtilsImpl().getCourse(2);
		//System.out.println(c);
			
		Counciler cc = new CouncilerUtilsImpl().login("rakesh_it", "1234");
			
		System.out.println(cc.getCu_name()); 
			
		
		
	}

}
