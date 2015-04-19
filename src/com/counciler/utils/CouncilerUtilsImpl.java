package com.counciler.utils;

import java.sql.*;
import java.util.*;

import com.counciler.DBUtils.*;
import com.counciler.beans.Counciler;
import com.counciler.beans.Course;
import com.counciler.beans.Student;

public class CouncilerUtilsImpl implements CouncilerUtils{

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	Statement st = null;
	

	@Override
	public Counciler login(String uname, String upass) {
		con = DBUtil.getConnected();
	  Counciler counciler  = null;
		String sql = "select * from counciler where Cu_username=? AND Cu_password=?";
		pst = DBUtil.getPreparedStatement(sql);
		try{
			pst.setString(1, uname);
			pst.setString(2, upass);
			
			rs = pst.executeQuery();
			
			if(rs != null){
				while(rs.next()){
					
					counciler = new Counciler();
					
					counciler.setCu_id(rs.getInt(1));
					counciler.setCu_name(rs.getString(2));
					counciler.setCu_username(rs.getString(3));
					counciler.setCu_password(rs.getInt(4));
					counciler.setCu_email(rs.getString(5));
					
				}
			}
			
			DBUtil.releaseResources();
			
		}catch(SQLException e){
			e.printStackTrace();
		}	
		
		return counciler;
	}
	@Override
	public boolean registerStudent(Student student) {
		
		int i = 0;
		boolean registered = false;
		con = DBUtil.getConnected();
		String sql = "insert into student (S_name,S_address,S_email,S_contact,course_id) values (?,?,?,?,?)";
		pst = DBUtil.getPreparedStatement(sql);
		try{
			pst.setString(1, student.getS_name());
			pst.setString(2, student.getS_address());
			pst.setString(3, student.getS_email());
			
			pst.setInt(4, student.getS_contact());
			pst.setInt(5, student.getCourse().getC_id());
			
			i = pst.executeUpdate();
			
			DBUtil.releaseResources();
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(i>0)
			registered = true;
		
		return registered;
	}
	@Override
	public List<Course> getAllCourses() {
		
		List<Course> courses = new ArrayList<Course>();
		Course c = null;
		con = DBUtil.getConnected();
		
		String sql = "select * from course;";
		
		st = DBUtil.getSimpleStatement();
		
		try{
			rs = st.executeQuery(sql);
			
				while(rs.next()){
					c = new Course();
					
					c.setC_id(rs.getInt(1));
					c.setC_name(rs.getString(2));
					c.setC_duration(rs.getInt(3));
					c.setC_fee(rs.getInt(4));
					c.setC_no_ofseats(rs.getInt(5));
					courses.add(c);
				}
			
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return courses;
	
		
	}
	@Override
	public Course getCourse(int C_id) {
		
		con = DBUtil.getConnected();
		Course course = null;
	
		String sql = "select * from course where C_id=?";
		pst = DBUtil.getPreparedStatement(sql);
		
		try{
			pst.setInt(1, C_id);
			
			rs = pst.executeQuery();
			
			if(rs != null){
				while(rs.next()){
					course = new Course();
					course.setC_id(rs.getInt(1));
					course.setC_name(rs.getString(2));
					course.setC_duration(rs.getInt(3));
					course.setC_fee(rs.getInt(4));
					course.setC_no_ofseats(rs.getInt(5));
				}
			}
			DBUtil.releaseResources();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return course;
		
	}
	
	@Override
	public List<Student> getStudents() {
		
		Course c = null;
		con = DBUtil.getConnected();
		List<Student> students = new ArrayList<Student>();
		Student s = null;
		String sql = "select * from student";
		st = DBUtil.getSimpleStatement();
		//pst = DBUtil.getPreparedStatement(sql);
		
		try{
			//pst.setInt(1, S_id);
			
			rs = st.executeQuery(sql);
			
			if(rs != null){
				while(rs.next()){
					
					s = new Student();
					
					s.setS_id(rs.getInt(1));
					s.setS_name(rs.getString(2));
					s.setS_address(rs.getString(3));
					s.setS_email(rs.getString(4));
					s.setS_contact(rs.getInt(5));
					c = new Course();
					c.setC_id(rs.getInt(6));
					s.setCourse(c);
					
					students.add(s);
				}
			}
			DBUtil.releaseResources();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return  students;

		
	}
	@Override
	public boolean incrementCapacity(int c_id,int no_seats) {
		 boolean increment= false;
		// Course cs= new Course();
		con=DBUtil.getConnected();
		int i=0;
		//List<Course>sts = new ArrayList<Course>();
		//Course course = null;
		String sql="update course set C_no_ofseet=? where C_id=?";
		pst=DBUtil.getPreparedStatement(sql);
		
		try{
			
			pst.setInt(1, no_seats);
			pst.setInt(2, c_id);
			
			i=pst.executeUpdate();
			
			
			DBUtil.releaseResources();
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(i>0)
			increment = true;
		
		return increment;
	}
			

}
