package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(10,10);
		
		System.out.println("클래스이름:" + p.getClass().getName());
		System.out.println("객체 식별 정보:" + p.hashCode());
		System.out.println("객체 출력:" + p);
		System.out.println("객체 식별 정보:" + p.toString());
		
		//객체 p의 부모 클래스 확인
		System.out.println("부모 정보:" + p.getClass().getSuperclass().getName());

	}

}
