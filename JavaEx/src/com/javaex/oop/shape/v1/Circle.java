package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	//	�ʵ�
	protected double radius;	//	������

	//	������
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf(
				"��[x=%d, y=%d, area=%.2f]�� �׷Ƚ��ϴ�.%n",
				x, y, area());
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}