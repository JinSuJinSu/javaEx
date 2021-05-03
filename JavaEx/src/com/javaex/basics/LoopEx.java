package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
		doWhileEx();
	}

	private static void doWhileEx() {
		//	while ���� �ݺ� ������ �ڿ��� Ȯ��
		//	�ּ� 1ȸ�� �����ؾ� �ϴ� ��� do ~ while �� ���
		//	����ڿ��� ���� �Է� �޾� ��� �ջ��ϴ� �ڵ�
		//	����ڰ� 0�� �Է��ϸ� �ݺ� ����
		int total = 0;
		int value = 0;

		Scanner scanner = new Scanner(System.in);

		do {	//	�ϴ� ���� �� �ڿ��� üũ
			System.out.print("���ڸ� �Է��ϼ���: [0�̸� ����]:");
			value = scanner.nextInt();
			total += value;
		} while (value != 0);	//	0�� �ƴϸ� �ݺ�

		System.out.println("�հ�:" + total);
		scanner.close();
	}


	private static void whileGugu() {
		//	while ���� �̿��� ����ǥ ���
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���:");
		int dan = scanner.nextInt();

		int i = 1;	//	���� ���� ����

		while(i <= 9) {	
			System.out.println(dan + "*" + i + "=" + (dan * i));
			//	����� ����\
			i++;
		} 
		scanner.close();
	}

	private static void whileEx() {
		//	1���� 10���� �ݺ��ϸ鼭 �ջ� �� ��� ���
		//	���� ���� 
		int num = 1;
		int total = 0;	//	�ջ� ����

		//	����
		while(num <= 10) {
//			total = total + num;
			total += num;	
			//	while���� ���� ������ ������ ����Ƿ�
			//	������� ������ ������ ��� �Ѵ�
			num++;
		}

		System.out.println("�ջ갪:" + total);

	}

}