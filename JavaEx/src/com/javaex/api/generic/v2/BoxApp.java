package com.javaex.api.generic.v2;

public class BoxApp {

	public static void main(String[] args) {
		//	Box ���� -> ���� ������ Ÿ�� ���� 
		Box<Integer> intBox = new Box<>();	//	��üȭ �� �� ���� ������ Ÿ�� ����
		intBox.setContent(2021);  //	intBox.setContent(Integer.valueOf(2021));
//		intBox.setContent("Java");	//	������ Ÿ�ӿ� ���ε����� üũ�� �� �� �ִ� -> ������

		//	���빰�� ���� ���ô�
		int retVal = intBox.getContent();	//	Ÿ�� ĳ������ ���ŷο� ����
		System.out.println("���빰:" + retVal);

		//	Box ���� String ���� ����
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");

		String strVal = strBox.getContent();
		System.out.println("strBox ���빰:" + strVal);

		//	���࿡ ĳ���� �߸� �ߴٸ�
		//	�����Ϸ��� ���� ������ Ÿ���� Ȯ���ؼ� ���� ������ �̸� üũ�� �� �ִ�
//		strVal = (String)intBox.getContent();

		//	Generic�� ����ϸ�
		//	1. ĳ������ �ؾ� �ϴ� ������ �ؼ�
		//	2. ĳ���� ������ ������ ������ Ÿ�ӿ��� üũ�� �� �ִ�
	}

}