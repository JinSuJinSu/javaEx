package com.javaex.basics;

import java.util.Scanner;	//	java.util ��Ű���� Scanner Ŭ������ �ε��ض�
//	�ʿ��� Ŭ���� ����ִ� ��Ű���� ��Ȯ�ϰ� ��Ī�ؾ� �Ѵ�

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();
//		consoleOutputEx();
		consoleInputEx();
	}

	private static void consoleInputEx() {
		//	��1. Ctrl + Shift + O
		//	��2. �ڵ� �ϼ� ��� Ȱ�� : Ctrl + Space
		Scanner scanner = new Scanner(System.in);	//	ǥ�� �Է����κ��� ������ �Է�

		System.out.println("�̸��� �Է��� �ּ���");
		System.out.print("�̸�:");

		String name = scanner.next();

		System.out.print("����:");

		int age = scanner.nextInt();

		System.out.println("����� �̸��� " + name + "�̰� " + age + "���Դϴ�.");

		//	���� ���� �ݾ�����!
		scanner.close();
	}

	private static void consoleOutputEx() {
		//	�ܼ� ���
		//	System.out -> ǥ�� ���
		//	System.err -> ǥ�� ����
		
		//	print �޼��� -> ��� �� ���� ����
		//	println �޼��� -> ��� �� ���� ��
		//	printf �޼��� -> ����ȭ�� ��� -> TODO: ���� String �׸񿡼� ����
		System.out.print("Hello "); 
		System.out.println("Java");
		
		//	�̽������� ����: Ư���� �ǹ̸� ���� ����
		System.out.println("Hello\nJava");	//	\n -> ���� ����
		System.out.println("Hello\tJava");	//	\t -> �ǹ���
		
		System.out.println("Hello, \"Java\"");	//	\" -> "
		//	\ ��ü�� ǥ���ϰ��� �� ��
		String dir = "C:\\Windows\\System";	//	\\ -> \
		System.out.println(dir);
		
		System.err.println("ǥ�� ���� ���!");
	}
}