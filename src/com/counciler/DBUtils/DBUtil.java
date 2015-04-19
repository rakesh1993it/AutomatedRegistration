package com.counciler.DBUtils;

import java.sql.*;


	public class DBUtil {
		static Connection con = null;
		static Statement st = null;
		static ResultSet rs = null;
		static PreparedStatement pst = null;
		

		public static Connection getConnected() {
			
			String url = "jdbc:mysql://localhost:3306/globsyn_db";
			String u = "root";
			String p = "root";
			
			// Load driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			try{
			con = DriverManager.getConnection(url,u,p);
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			return con;
		}
		
		public static Statement getSimpleStatement(){
			try{
			st = con.createStatement();
			}catch(SQLException e){
				e.printStackTrace();
			}
			return st;
		}
		
		public static PreparedStatement getPreparedStatement(String sql){
			try{
			pst = con.prepareStatement(sql);
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			return pst;
		}
		
		public static void releaseResources(){
			try{
			if(pst != null)
				pst.close();
			if(st != null)
				st.close();
			if(rs != null)
				rs.close();
			if(con != null)
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

	}


