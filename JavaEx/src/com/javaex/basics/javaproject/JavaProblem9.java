package com.javaex.basics.javaproject;

public class JavaProblem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �־��� �迭���� 3�� ����� ������ 3�� ����� ���� ���϶�
		int[]data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int count=0;
		int sum=0;
		
		for(int value:data) {
			if(value%3==0) {
				count++;
				sum+=value;
			}
		}
		System.out.println("�־��� �迭���� 3�� ����� ����=>"+count);
		System.out.println("�־��� �迭���� 3�� ����� ��=>"+sum);

	}

}
