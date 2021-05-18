package com.javaex.jdbc.oracle.dao;

import java.util.*;


// ���赵 �ۼ�
public interface AuthorDAO {
	public List<AuthorVO> getList(); //�ܼ� select
	public List<AuthorVO> search(String keyword); // like �˻�
	public AuthorVO get(Long id); // pk�� �����´�
	public boolean insert(AuthorVO vo); // INSERT
	public boolean delete(Long id); //pk�� ����
	public boolean update(AuthorVO vo);
	
	

}
