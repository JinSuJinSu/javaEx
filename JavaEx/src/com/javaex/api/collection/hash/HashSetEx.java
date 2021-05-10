package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
//		hashSetBasic();
		hashSetCustom();
	}

	private static void hashSetCustom() {
		//	����� ���� Ŭ������ HashSet
		HashSet<Student> hs = new HashSet<>();

		Student s1 = new Student("ȫ�浿", 10);
		Student s2 = new Student("ȫ�浿", 10);
		Student s3 = new Student("ȫ�浿", 20);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println(hs);

		//	���� ���� Ȯ��
		System.out.println("ȫ�浿, 10 �л��� �ִ°�? " + 
				hs.contains(new Student("ȫ�浿", 10)));
	}

	private static void hashSetBasic() {
		//	����
		HashSet<String> hs = new HashSet<>();

		//	��ü �߰�
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); //	�ߺ� ���� ��� ����
		//	������ �߿����� �ʴ�

		System.out.println(hs);
		System.out.println(hs.size() + "���� ��Ҹ� ���� ����");

		//	���� ���� Ȯ��
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));

		//	��ü�� ����
		hs.remove("C++");
		System.out.println(hs);
	}

}