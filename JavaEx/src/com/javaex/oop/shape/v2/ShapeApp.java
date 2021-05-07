package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape();	//	�߻� Ŭ������ �ν��Ͻ�ȭ �Ұ�

		Shape r = new Rectangle(10, 20, 100, 50);
		Shape c = new Circle(30, 40, 30);

		if (r instanceof Drawable) {
			((Drawable)r).draw();
		}

		if (c instanceof Drawable) {
			((Drawable)c).draw();
		}

		//	�׸��ǿ��� �׸��� ��ü�� ����
		Drawable d1 = (Drawable)r;
		Drawable d2 = (Drawable)c;

		//	�������̽� Ÿ������ �ش� �������̽��� ������ �ν��Ͻ��� ������ �� �ִ�
		Drawable objs[] = {
				d1,
				d2,
				new Point(10, 20)
		};

		for (Drawable obj: objs) {
			obj.draw();
		}
	}
}