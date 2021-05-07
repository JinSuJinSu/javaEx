package com.javaex.oop.shape.v1;

//	�߻� Ŭ����
//		������ ��üȭ �Ұ�
//		�ڽĿ��� �����ֱ� ���� ���赵�θ� ����
//		�ݵ�� �� ���̻��� �߻� �޼��带 ������ �Ѵ�
//		Ư�� ����� ������ �����ϴ� ����
public abstract class Shape {
	//	�ʵ�
	protected int x;
	protected int y;

	//	������
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//	�޼���� �߻� �޼��� or �Ϲ� �޼��带 ���� �� �ִ�
	//	�߻� �޼��尡 �� �� �̻� �־��
	public abstract void draw();	//	���� �Ѵ� -> ������ ��ü Ŭ��������
	public abstract double area();	
}