package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
//		Point p1 = new Point(10, 20);
//		p1.draw();
//
//		Point p2 = new Point(30, 40);
//		p2.draw();
//
//		//	�����ε��� �޼��� ȣ��
//		p1.draw(true);
//		p1.draw(false);
//
//		p2.draw(true);
//		p2.draw(false);
		
		Point cp1 = new ColorPoint(50,60,"red");
		cp1.draw(true);
		
		Point cp2 = new ColorPoint(100,200,"blue");
		cp1.draw(false);
		
	}

}