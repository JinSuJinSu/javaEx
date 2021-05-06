package com.javaex.oop.goods.v3;

//	v3. ������ : ��ü�� �ν��Ͻ�ȭ �� �� �ʱ�ȭ�� ���
//		���� Ÿ���� ������, Ŭ���� ��� ���ƾ� �Ѵ�
public class Goods {
	//	�ʵ�
	private String name;
	private int price;

	//	������
	//	1. ����ڰ� ������ �����ڰ� �ϳ��� ���� ���, �����Ϸ��� �⺻ �����ڸ� �߰�
	//	2. ����ڰ� �����ڸ� ������ ���, �����Ϸ��� �⺻ �����ڸ� �߰����� �ʴ´�
	public Goods(String name, int price) {
		//	�ʱ�ȭ �ڵ�
		this.name = name;
		this.price = price;
	}

	//	Getter
	//		Setter �� ���� ���, �б� ������ �ȴ�
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getPrice() {
		return price;
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}

	//	�޼���
	public void showInfo() {
		System.out.println("��ǰ��:" + name);
		System.out.println("����:" + price);
	}

}