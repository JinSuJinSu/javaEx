package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		// ����	: Map �������̽�
		Map<String, ClassRoom> map =
				new Hashtable<>();	//	Ű�� String���, �� ClassRoom

		//	������ ���: put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));

		//	Ű�� ������ ����, Ű�� �ߺ��� �� ����
		System.out.println(map);

		//	���� ����
		map.put("404", new ClassRoom("SQL", "R404"));
		System.out.println(map);

		//	Ű�� ����� �� �������� : get
		System.out.println("303:" + map.get("303"));

		//	Ű�� �ִ��� Ȯ�� : containsKey
		System.out.println("303 �� �ִ°�? " + map.containsKey("303"));
		System.out.println("505 �� �ִ°�? " + map.containsKey("505"));

		//	�� �߿��� subject�� Java�� ���� �ִ°�? : containsValue
		System.out.println("Java�� ���� �ִ°�? "
				+ map.containsValue(new ClassRoom("Java", "R101")));


		//	�� ����
		map.clear();
		System.out.println(map);
	}

}