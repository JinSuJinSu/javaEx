package com.javaex.basics.javaproject;



public class JavaProblem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڿ��� ������ ,�� �ٲ㼭 ����ϼ���
		
		char[] array = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(char letter:array) {
			System.out.print(letter);
		}
		System.out.println();
		
		String str = new String(array);
		str= str.replace(" ", ",");
		
		System.out.println(str);

		
		
		
		

	}

}
