package com.javaex.jdbc.oracle.dao;

//DTO ��ü: �ڹ��� ������ ������ ������ ����ϴ� ��ü
// �ʵ�, getter/setter, toString, equals ������ �޼��常 �ۼ�
// �ݵ�� �⺻ �����ڰ� �־�� ��
// �Ϲ������� ���� �޼���� �ۼ� ����

public class AuthorVO {
	private Long id;
	private String authorName;
	private String authorDesc;
	
	
	// ������
	public AuthorVO() {
		
	}
	
	// �ʼ� �ʵ� ������
	
	public AuthorVO(Long id, String authorName) {
		this.id = id;
		this.authorName = authorName;
	}
	
	// ��ü �ʵ� ������
	public AuthorVO(Long id,String authorName, String authorDesc) {
		this(id, authorName);
		if(authorDesc == null) {
			this.authorDesc = "";
		}
		else {
			this.authorDesc = authorDesc;
		}
		
	}
	



	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc == null ? "": authorDesc;
	}

	@Override
	public String toString() {
		return "AuthorVO [id=" + id + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
}
	
	
