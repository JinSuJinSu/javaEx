package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		//	�����ڸ� �̿��� ��ü�� �ʱ�ȭ
		Goods notebook = new Goods("LG Gram", 1500000);

		Goods smartphone = new Goods("iPhone", 1000000);

		System.out.printf("%s, %d��%n", 
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d��%n", 
				smartphone.getName(),
				smartphone.getPrice());

		//	price, name �ʵ�� �б� ���� �ʵ� �����͸� ������ �� ����
//		notebook.setPrice(15000);
//		smartphone.setPrice(10000);

		//	���� �޼��� ȣ��
		notebook.showInfo();
		smartphone.showInfo();
	}

}