package com.javaex.jdbc.oracle.dao;

import java.util.*;


public class AuthorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selectAll();
		//insertAuthor();
		// updateAuthor();
		// deleteAuthor();
		// searchAuthor();
		// getAuthorInfo();
		
		

	}
	private static void getAuthorInfo() {
		selectAll();
		//	��ĳ�ʷκ��� PK �Է� �޾� ���� ���� ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ھ��̵�:");
		int id = scanner.nextInt();

		AuthorDAO dao = new AuthorDAOImpl();

		AuthorVO vo = dao.get(Long.valueOf(id)); 

		if (vo != null) {	//	�˻�
			System.out.printf("%d\t%s\t%s%n", 
					vo.getId(), vo.getAuthorName(), vo.getAuthorDesc());
		} else {	//	Not Found
			System.out.println("Not Found");
		}
		scanner.close();
	}
	
	private static void searchAuthor() {
		//	Scanner���� Ű���� �Է� -> �κ� �˻�
		Scanner scanner = new Scanner(System.in);
//		selectAll();
		System.out.print("�˻���:");
		String keyword = scanner.next();

		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> list = dao.search(keyword);

		Iterator<AuthorVO> it = list.iterator();

		while(it.hasNext()) {
			AuthorVO vo = it.next();
			System.out.printf("%d\t%s\t%s%n", 
					vo.getId(),
					vo.getAuthorName(),
					vo.getAuthorDesc());
		}
		scanner.close();
	}
	
	
	private static void deleteAuthor() {
		// scanner���� ���� PK �Է� �޾� delete�Ѵ�.
		Scanner scanner = new Scanner(System.in);
		selectAll();
		System.out.println("������ ����:");
		int id = scanner.nextInt();
		
		
		AuthorDAO dao = new AuthorDAOImpl();
		
		boolean sucess = dao.delete(Long.valueOf(id));
		
		System.out.println("DELETE" + (sucess? "����":"����"));
		
		selectAll();
	}
	
	private static void updateAuthor() {
		// scanner���� ���� pk, ���� ������ �Է� -> update
		Scanner scanner = new Scanner(System.in);
		selectAll();
		System.out.println("������ ����:");
		int id = scanner.nextInt();
		System.out.println("������ ���� ����:");
		String desc = scanner.next();
		
		AuthorVO vo = new AuthorVO(Long.valueOf(id), null, desc);
		AuthorDAO dao = new AuthorDAOImpl();
		
		boolean sucess = dao.update(vo);
		
		System.out.println("UPDATE" + (sucess? "����":"����"));
		
		selectAll();
		scanner.close();
		
		
		
	}
	private static void insertAuthor() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸�:");
		String name = scanner.next();
		
		AuthorVO vo = new AuthorVO(null, name);
		AuthorDAO dao = new AuthorDAOImpl();
		
		boolean sucess = dao.insert(vo);
		
		System.out.println("INSERT" + (sucess? "����":"����"));
		
		selectAll();
		scanner.close();
		
	}
	
	private static void selectAll() {
		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> list = dao.getList();
		
		//Iterator
		Iterator<AuthorVO> it = list.iterator();
		
		System.out.println("======== Author List");
		
		while(it.hasNext()) {
			AuthorVO item = it.next(); // iterator���� ��� ����
			System.out.printf("%d\t%s\t%s%n",item.getId(), item.getAuthorName(), item.getAuthorDesc());
		}
	}

}
