package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//	setter�� �̿��� ��ȸ ����
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);

		Goods smartphone = new Goods();
		smartphone.setName("iPhone");
		smartphone.setPrice(1000000);

		System.out.printf("%s, %d��%n", 
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d��%n", 
				smartphone.getName(),
				smartphone.getPrice());

		//	���� �޼��� ȣ��
		notebook.showInfo();
		smartphone.showInfo();
	}

}