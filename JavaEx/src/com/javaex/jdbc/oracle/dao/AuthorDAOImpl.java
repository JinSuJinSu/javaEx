package com.javaex.jdbc.oracle.dao;

import java.util.*;
import java.sql.*;

public class AuthorDAOImpl implements AuthorDAO {
	
	//공통 접속 메소드
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl,"C##hajinsu","1234");
			
		}
		catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!!");
		}
		
		return conn;
	}

	@Override
	public List<AuthorVO> getList() {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		
		
		//select
		ResultSet rs = null;
		
		//결과 객체
		List<AuthorVO> list = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			//쿼리 작성
			String sql = "select author_id, author_name, author_desc from author";
			
			//쿼리 실행
			rs = stmt.executeQuery(sql);
			
			//ResultSet을 자바 객체로 변환
			while(rs.next()) {
				long id = rs.getLong(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);
				
				//DTO 객체
				AuthorVO vo = new AuthorVO(id, authorName, authorDesc);
				list.add(vo);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}
			catch(Exception e) {
				System.err.println("에러! 에러!");
				
			}
			
		
		
	}
		
		return list;
		
	}

	@Override
	public List<AuthorVO> search(String keyword) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<AuthorVO> list = new ArrayList<>();

		String sql = "SELECT author_id, author_name, author_desc FROM author " +
					" WHERE author_name LIKE ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "%" + keyword + "%");

			//	쿼리 수행
			rs = pstmt.executeQuery();

			//	변환 
			while(rs.next()) {
				Long id = rs.getLong("author_id");
				String authorName = rs.getString("author_name");
				String authorDesc = rs.getString("author_desc");

				//	VO 객체
				AuthorVO vo = new AuthorVO(id, authorName, authorDesc);
				list.add(vo);
			}
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
		return list;
	}

	@Override
	public AuthorVO get(Long id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		AuthorVO vo = null;

		try {
			conn = getConnection();
			String sql = "SELECT author_id, author_name, author_desc FROM author " +
						" WHERE author_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			rs = pstmt.executeQuery();	//	쿼리 실행
//			rs.next();	//	첫 번째 레코드?

			if (rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);

				vo = new AuthorVO(authorId, authorName, authorDesc);
			}
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

		return vo;
	}

	@Override
	public boolean insert(AuthorVO vo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			// 실행 쿼리
			String sql = "insert into author values(seq_author_id.nextval,?,?)";
			pstmt = conn.prepareStatement(sql);
			// 데이터 바인딩
			pstmt.setString(1, vo.getAuthorName());
			pstmt.setString(2, vo.getAuthorDesc());
			
			//쿼리 실행
			insertedCount = pstmt.executeUpdate();
		}
			
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					pstmt.close();
					conn.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		
		
	
	
		
		return 1== insertedCount;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		
		try {
			conn = getConnection();
			// 실행 계획
			String sql = "delete from author where author_id=?";
			pstmt = conn.prepareStatement(sql);
			// 파라미터 바인딩
			pstmt.setLong(1, id);
			
			
			deletedCount = pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return 1==deletedCount;
	}

	@Override
	public boolean update(AuthorVO vo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			// 실행 계획
			String sql = "update author set author_desc=? where author_id=?";
			pstmt = conn.prepareStatement(sql);
			// 파라미터 바인딩
			pstmt.setString(1, vo.getAuthorDesc());
			pstmt.setLong(2, vo.getId());
			
			updatedCount = pstmt.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return 1==updatedCount;
	}

}