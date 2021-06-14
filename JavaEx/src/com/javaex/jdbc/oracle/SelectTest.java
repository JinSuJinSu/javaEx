package com.javaex.jdbc.oracle;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			// 커넥션 획득
			conn = DBConfig.getConnection();
			// statement 생성
			stmt = conn.createStatement();
			// 쿼리 실행
			String sql = "SELECT department_id, department_name " + " from departments";
			// 결과 객체 받아오기
			rs = stmt.executeQuery(sql);
			
			// 결과 출력
			while(rs.next()) {
				Long deptId = rs.getLong(1);
				String deptName = rs.getString("department_name");
				
				System.out.printf("%d:%s%n",deptId,deptName);
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
			
		
		
		
		

	}

}