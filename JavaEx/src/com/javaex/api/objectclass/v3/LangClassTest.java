package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(10,10);
		
		System.out.println(p1);
		
		Point p2 = p1.getClone();
		
		System.out.println(p1.equals(p2));
		

	}

}
