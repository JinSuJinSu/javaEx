package com.javaex.api.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		//	Box ���� int ���� ����
		Box intBox = new Box();
		intBox.setContent(2021);  //	intBox.setContent(Integer.valueOf(2021));

		//	���빰�� ���� ���ô�
		int retVal = (int)intBox.getContent();
		System.out.println("���빰:" + retVal);

		//	Box ���� String ���� ����
		Box strBox = new Box();
		strBox.setContent("Java");

		String strVal = (String)strBox.getContent();
		System.out.println("strBox ���빰:" + strVal);

		//	���࿡ ĳ���� �߸� �ߴٸ�
//		strVal = (String)intBox.getContent();

		//	1. Object�� �ٷ� �� �ִ� Ŭ������ �����ϸ�
		//		ĳ������ �ؾ� �ϴ� ������
		//	2. ĳ���� ������ ������ Ÿ�ӿ��� üũ�� �� ����
	}

}