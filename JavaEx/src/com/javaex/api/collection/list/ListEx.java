package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// ����
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();	//	������

		//	��ü �߰�
		lst.add("Java");	//	add -> �� �ڿ� �� ��� �߰�
		lst.add("C");
		lst.add("C++");
		lst.add("Python");

		System.out.println(lst);

		//	��ü�� ����(�߰��� ��ü ����)
		lst.add(2, "C#");  //	2�� �ε��� ��ġ�� C#�� �߰�

		lst.add("Java");	//	�ߺ� ���� ���
		System.out.println(lst);

		//	����� ���� Ȯ��
		System.out.println("����� ����:" + lst.size()); //	capacity�� Ȯ�� x

		//	����� ����
		lst.remove(2);	//	�ε����� �̿��� ����
		//	��ü�� ����: �־��� ��ü ������ ����
		lst.remove("Python");
		System.out.println(lst);

		//	TODO: ����

		//	��� ���ô�:
		lst.clear();
		System.out.println(lst);
	}

}