package com.javaex.oop.point.v4;

//	��� �ޱ� 
public class ColorPoint extends Point {
	//	�θ�κ��� �ʵ�� �޼��带 ��������
	private String color;
	//	������
	public ColorPoint(int x, 
			int y,
			String color) {
		//	������� ������ �θ��� �⺻ �����ڸ�
		//	����
		super(x, y);	//	��������� �θ��� ������ ȣ��
		this.color = color;
	}

	//	�������� ����� �����ϰ� ��ü������ �籸��
	@Override
	public void draw() {
		/* ��� 1
		System.out.printf("������[x=%d, y=%d, color=%s]�� �׷Ƚ��ϴ�.%n", 
				super.getX(),	//	�θ��� �޼��� ȣ�� 
				super.getY(), 
				color);
				*/

		/* ��� 2. �θ��� �ʵ� ���� �����ڸ� protected�� ���� */
		System.out.printf("������[x=%d, y=%d, color=%s]�� �׷Ƚ��ϴ�.%n", 
				x,	//	�θ��� �޼��� ȣ�� 
				y, 
				color);
	}

	@Override
	public void draw(boolean show) {
		String message = String.format("������[x=%d, y=%d, color=%s]�� ", 
				x, y, color);
		message += show ? "�׷Ƚ��ϴ�.": "�������ϴ�.";
		System.out.println(message);

		//	Override�� �ص� �θ��� �޼��尡 �������� ���� �ƴϴ�.
		//	��������� super Ű���带 �̿��� �θ��� �޼��忡 ������ �� �ִ�.
//		System.out.println("�θ��� �޼��� ȣ��:");
//		super.draw(show);
	}

}