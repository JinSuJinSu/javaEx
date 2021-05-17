package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

//	Scanner�� Ű���� �Է�
//	first_name, last_name �ʵ� ��� �κ� �˻�
//	�̸� ��, Email, ��ȭ��ȣ, �Ի��� ���
public class HRSearchEmployeesPSTMT {

	public static void main(String[] args) {
		Connection conn = null;	//	Ŀ�ؼ�
//		Statement stmt = null;	//	����
		PreparedStatement pstmt = null;	
		ResultSet rs = null;	//	��� ��
		Scanner scanner = new Scanner(System.in);

		try {
			conn = DBConfig.getConnection();

			System.out.print("�˻���:");
			String keyword = scanner.next();

			//
//			String sql = "SELECT first_name, last_name, " +
//					"email, phone_number, hire_date " +
//					" FROM employees " +
//					" WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + "%' OR " +
//					" lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";

			String sql = "SELECT first_name, last_name, email, phone_number, hire_date " +  
					" FROM employees " +
					" WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			System.out.println("Template:" + sql);
			//	���� ��ȹ ���� -> LIKE �˻����� Tip
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");	//	���ε��� ���� ���ϵ� ī�带 ���� ����
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");

			//	���� ����
//			rs = pstmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			//	Loop
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");	

				//	���
				System.out.printf("%s %s: %s, %s, %s%n", 
						firstName, lastName, email, phoneNumber, hireDate);
			}

			scanner.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {

			}
		}
	}

}