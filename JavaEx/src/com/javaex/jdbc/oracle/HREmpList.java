package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

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
			String sql = "select emp.first_name||' '|| emp.last_name, "
					+ "man.first_name||' '|| man.last_name "
					+ "from employees emp "
					+ "inner join employees man "
					+ "on emp.manager_id = man.employee_id "
					+ "order by emp.first_name||' '|| emp.last_name";
			// 결과 객체 받아오기
			rs = stmt.executeQuery(sql);
			
			// 결과 출력
			while(rs.next()) {
				String employeeName = rs.getString(1);
				String ManagerName = rs.getString(2);
				
				System.out.printf("%s:%s%n",employeeName,ManagerName);
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