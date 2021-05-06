package com.javaex.oop.goods.v4;

//	v4. this: ��ü �ڽ��� ��Ī
//		this() : ��ü �ڽ��� �ٸ� �����ڸ� ��Ī�� �� ���
public class Goods {
	//	�ʵ�
	private String name;
	private int price;

	//	������
	public Goods(String name) {
		this.name = name;
	}

	public Goods(String name, int price) {
		//	Ŭ���� ������ �ٸ� �����ڸ� ȣ���� ���� this()
		this(name);
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