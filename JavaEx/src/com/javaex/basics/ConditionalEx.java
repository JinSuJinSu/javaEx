package com.javaex.basics;
import java.util.Scanner;
public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
		ifElseEx2();
//		ifElseEx2();
//		ifElseEx3();
//		switchEx();
//		switchEx2();
		switchEx3();
	}

	private static void switchEx3() {
		//	�ڵ� ���� ���ڿ��� �����ϴ� ���
		//	-> ��Ÿ �߻� ����, ������ �ʴ� �Է��� �Ѿ���� ��찡 �ִ�
		//	�ڵ��� ������ ���� ����, �Է� ���� �����ؾ� �Ѵ�
		//	-> TODO: enum ���������� ���ۼ��� �� �� ��
		String day = "MONDAY";
		String act = "";

		//	MONDAY ~ THURSDAY : act <- ����
		//	FRIDAY : act <- �ұ�
		//	SATURDAY : act <- �ָ�
		//	SUNDAY : act <- �޽�
		//	������ : act <- ?
		switch (day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "����";
			break;
		case "FRIDAY":
			act = "�ұ�";
			break;
		case "SATURDAY":
			act = "�ָ�";
			break;
		case "SUNDAY":
			act = "�޽�";
			break;
		default:
			act = "?";
		}

		System.out.println(day + "���� " + act);
	}

	private static void switchEx2() {
		//	���� �Է� �޾�
		//	1, 3, 5, 7, 8, 10, 12�� -> 31��
		//	4, 6, 9, 11 -> 30��
		//	2 -> 28��
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�:");

		int month = scanner.nextInt();

		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			//	month == 1 || month == 3 || ...
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		case 2:
			System.out.println("28��");
			break;
		default:
			System.out.println("?");
		}

		scanner.close();
	}

	private static void switchEx() {
		//	ifElseEx3�� switch ������ ����� ���ô�
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 1. Java, 2. C, 3. C++, 4. ���̽�");
		int subject = scanner.nextInt();

		//	switch ~ case ������ ����
		//	Ư���� ��찡 �ƴϸ� case���� break���� ������ ����
		switch(subject) {
		case 1:	//	subject == 1
			System.out.println("R101");
			break;
		case 2:	//	subject == 2
			System.out.println("R202");
			break;
		case 3: //	subject == 3
			System.out.println("R303");
			break;
		case 4:	//	subject == 4
			System.out.println("R404");
			break;
		default:	//	else �� -> ���� ��ġ�ϴ� ���� ���� �� ����
			System.out.println("�����ڿ��� �����ϼ���");
		}

		scanner.close();
	}

	private static void ifElseEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 1. Java, 2. C, 3. C++, 4. ���̽�");
		int subject = scanner.nextInt();

		if (subject == 1) {
			System.out.println("R101");
		} else if (subject == 2) {
			System.out.println("R202");
		} else if (subject == 3) {
			System.out.println("R303");
		} else if (subject == 4) {
			System.out.println("R404");
		} else {
			System.out.println("�������� �����ϼ���");
		}

		scanner.close();
	}

	private static void ifElseEx2() {
		//	���� �Է�
		//	����� ��
		//		¦��, Ȧ��
		//	������ �� -> ����
		//	0�̸� 0
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		
		int num = scanner.nextInt();
		
		if (num > 0) {
			//	���
			if (num % 2 == 0) {
				System.out.println("¦��");
			} else {
				System.out.println("Ȧ��");
			}
		} else {
			//	���� or 0
			if (num == 0) {
				System.out.println("0�Դϴ�.");
			} else {	//	���� 
				System.out.println("�����Դϴ�.");
			}
		}
		
		scanner.close();
	}
	
	private static void ifElseEx() {
		//	������ �Է� �޾Ƽ�
		//	���, ����, 0�� ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		
		int num = scanner.nextInt();
		
		/*
		if (num > 0) {	//	���� 1
			System.out.println("����Դϴ�.");
		} else if (num < 0) {	//	���� 2
			System.out.println("�����Դϴ�.");
		} else {
			//	�� ������ �ϳ��� ���� ���� ��
			System.out.println("0�Դϴ�.");
		}
		*/
		
		//	��ø if 
		if (num == 0) {
			System.out.println("0�Դϴ�.");
		} else {	//	0�� �ƴ� ��
			if (num > 0) {
				//	���
				System.out.println("����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		
		scanner.close();
	}
}