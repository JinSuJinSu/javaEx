package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {
		stringBasic();
	}

	private static void stringBasic() {
		//	���ڿ� ����
		String str;	//	����
		str = "Java";	//	�Ҵ�	-> Literal (�ڵ忡 ���� �Է��� ��)
		String str2 = "Java";	//	���� + �Ҵ� -> Literal
		String str3 = new String("Java");	//	�� ��ü 

		//	���� ������ ��ü�� �ּҸ� ������ �ִ�
		//	���� ������ ==, !=�� �ּҸ� ���ϴ� ��
		//	Literal vs Literal
		System.out.println("str == str2 ? " + (str == str2));	//	�ּҰ� ����
		//	Literal vs new String
		System.out.println("str == str3 ? " + (str == str3));

		//	���� ������ ���� �������� �� -> equals
		System.out.println("str�� str2�� ������ ������?" + str.equals(str2));
		System.out.println("str�� str3�� ������ ������?" + str.equals(str3));
		System.out.println();
	}

}