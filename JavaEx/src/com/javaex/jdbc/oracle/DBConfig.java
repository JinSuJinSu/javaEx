package com.javaex.jdbc.oracle;

import java.sql.*;

public class DBConfig {
	public static String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String DBUSER = "hr";
	public static String DEPASS = "hr";
	
	
	
	static Connection getConnection() throws SQLException{
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBURL,DBUSER,DEPASS);
		}
		catch(ClassNotFoundException e){
			System.err.println("에러 발생! 에러 발생!");
			
		}
		
		return conn;
		
}
}
