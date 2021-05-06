package com.javaex.oop.point.v4;

//	v2. ������
public class Point {
	//	�ʵ�
	protected int x;
	protected int y;

	//	������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//	Getter/Setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//	�޼���
	public void draw() {
		System.out.printf("��[x=%d, y=%d]�� �׷Ƚ��ϴ�.%n", x, y);
	}

	//	�޼��� �����ε�
	//	�������� �Ϻ�: �ٸ� �޼���� ���� �̸������� �Ű������� Ÿ��, ����, ������ �ٸ� �޼��带 ����
	public void draw(boolean show) {
		String message = String.format("��[x=%d, y=%d]�� ", x, y);
		if (show) {
			message += "�׷Ƚ��ϴ�.";
		} else {
			message += "�������ϴ�.";
		}
		System.out.println(message);
	}
}