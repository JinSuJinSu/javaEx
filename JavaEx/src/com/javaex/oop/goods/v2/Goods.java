package com.javaex.oop.goods.v2;

//������ ������ �� �ִ� Ư�� �޼��� : getter / setter ����
public class Goods {
//	�ʵ�
private String name;
private int price;

//	Getter/Setter
public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getPrice() {
return price;
}

public void setPrice(int price) {
this.price = price;
}

//	�޼���
public void showInfo() {
System.out.println("��ǰ��:" + name);
System.out.println("����:" + price);
}

}