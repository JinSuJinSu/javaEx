package com.javaex.jdbc.oracle.dao;

import java.util.*;


// 설계도 작성
public interface AuthorDAO {
	public List<AuthorVO> getList(); //단순 select
	public List<AuthorVO> search(String keyword); // like 검색
	public AuthorVO get(Long id); // pk로 가져온다
	public boolean insert(AuthorVO vo); // INSERT
	public boolean delete(Long id); //pk로 삭제
	public boolean update(AuthorVO vo);
	
	

}