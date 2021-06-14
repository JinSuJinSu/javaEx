package com.javaex.api.objectclass.v2;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(10,10);
		Point p2 = new Point(10,10);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(
				p2));
		// equals을 했는 데도 false가 나오는 이유
		

	}

}