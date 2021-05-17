package com.javaex.jdbc.oracle;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			// Ŀ�ؼ� ȹ��
			conn = DBConfig.getConnection();
			// statement ����
			stmt = conn.createStatement();
			// ���� ����
			String sql = "SELECT department_id, department_name " + " from departments";
			// ��� ��ü �޾ƿ���
			rs = stmt.executeQuery(sql);
			
			// ��� ���
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
