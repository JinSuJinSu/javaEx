package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(10,10);
		
		System.out.println("Ŭ�����̸�:" + p.getClass().getName());
		System.out.println("��ü �ĺ� ����:" + p.hashCode());
		System.out.println("��ü ���:" + p);
		System.out.println("��ü �ĺ� ����:" + p.toString());
		
		//��ü p�� �θ� Ŭ���� Ȯ��
		System.out.println("�θ� ����:" + p.getClass().getSuperclass().getName());

	}

}
