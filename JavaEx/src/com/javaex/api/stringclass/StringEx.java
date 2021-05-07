package com.javaex.api.stringclass;
public class StringEx {
	public static void main(String[] args) {
//		stringBasic();
		usefulMethods();
	}
	
	private static void stringBasic() {
		String s1 = "Java";	//	���ͷ�
		String s2 = new String("Java");	//	�� ��ü 
		String s3 = "Java";	//	���ͷ�
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); //	���ͷ� vs new
		System.out.println("s1 == s3 ? " + (s1 == s3));	//	���ͷ� vs ���ͷ�
		
		//	valueOf() �޼��� : �⺻ Ÿ���� -> ���ڿ��� ����
		String s4 = String.valueOf(Math.PI);
		System.out.println("valueOf �޼���:" + s4);
	}

	private static void usefulMethods() {
		String str = "Java Programming JavaScript Programming";

		//	���̸� ���� �� �ְ�, �ε��� ���� ����
		System.out.println("LENGTH:" + str.length());
		System.out.println("5�� �ε����� ����:" + str.charAt(5));

		//	��ȯ �޼���
		System.out.println("�ҹ��� ��ȯ:" + str.toLowerCase());
		System.out.println("�빮�� ��ȯ:" + str.toUpperCase());

		//	�˻� ����(�߿�)
		int idx;
		idx = str.indexOf("Java");
		System.out.println("1��° �˻�:" + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("2��° �˻�:" + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("3��° �˻�:" + idx);	//	�˻�� ���� �� -> -1
		//	������ �˻�
		System.out.println("������ �˻�:" + str.lastIndexOf("Java"));

		//	���ڿ� ����
		System.out.println("substring:" + str.substring(5)); //	������
		System.out.println("substring:" + str.substring(5, 16));	//	5 ~ 16 - 1

		//	ġȯ
		System.out.println("replace:" + str.replaceAll("Java", "java"));

		//	���鹮�� ����
		String s2 = "          Hello           ";
		String s3 = "         , Java          ";

		System.out.println(s2.trim() + s3.trim());

		//	����: split 
		String[] chunks = str.split(" ");	//	������ �������� ���ڿ��� ����
		for (String chunk: chunks) {
			System.out.println("WORD:" + chunk);
		}

		//	���ڿ� ��: Unicode ��
		//	������ 0, ���� ���� ������(����) ����, ���� ���� ũ��(�ڸ�) ���
		System.out.println("ABC".compareTo("ABD"));
	}

}