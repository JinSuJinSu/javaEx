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
			// Ä¿³Ø¼Ç È¹µæ
			conn = DBConfig.getConnection();
			// statement »ý¼º
			stmt = conn.createStatement();
			// Äõ¸® ½ÇÇà
			String sql = "select emp.first_name||' '|| emp.last_name, "
					+ "man.first_name||' '|| man.last_name "
					+ "from employees emp "
					+ "inner join employees man "
					+ "on emp.manager_id = man.employee_id "
					+ "order by emp.first_name||' '|| emp.last_name";
			// °á°ú °´Ã¼ ¹Þ¾Æ¿À±â
			rs = stmt.executeQuery(sql);
			
			// °á°ú Ãâ·Â
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