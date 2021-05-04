package com.javaex.basics;

import java.util.Scanner;
import java.lang.Math;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forEx();
//		continueEx();
		guGu();
//		numberJudge();
//		lotoCreation();
		starEx();
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
	private static void forEx() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(number + " * " + i + " = " + (number*i));
		}
		
		
		scanner.close();
		
	}
	
	public static void continueEx() {
		for(int i=1; i<=20; i++) {
		if(i%2==0 || i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static void guGu(){
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
	}
	
	public static void numberJudge(){
		int i=14;
	
		while(true) {
			if(i%6==0 && i%14==0) {
				break;
			}
			else {
				i++;
			}
			
		}
		System.out.println(i);
	}
	public static void lotoCreation() {
	for(int i=1; i<=6; i++) {
		int num = (int)(Math.random()*45)+1;
		System.out.println(num);
	}
	

}
	
	public static void starEx() {
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

}
	}