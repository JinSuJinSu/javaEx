package com.javaex.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
//		arithmeticExceptionEx();
//		nullPointerExceptionEx();
//		arrayExceptionEx();
		throwExceptEx();
	}

	private static void throwExceptEx() {
		ThrowExcept te = new ThrowExcept();

		try {
			te.divide(100, 0);
			te.executeRuntimeException();
			te.executeException();  // IOException -> Checked -> �ݵ�� ���� ó�� �ʿ�
		} catch (CustomArithmeticException e) {
			System.err.println("����� ���� ����:" + e.getMessage());
			//	��Ȳ ���� Ȯ��
			System.err.println("num1:" + e.getNum1());
			System.err.println("num2:" + e.getNum2());
		} catch (IOException e) {
			System.err.println("���� �޽���:" + e.getMessage());
		} catch (RuntimeException e) {
			System.err.println("��Ÿ�� ����:" + e.getMessage());
		}


		System.out.println("End of Code");
	}

	private static void arrayExceptionEx() {
		int[] intArray = new int[] { 3, 6, 9 };

		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error:" + e.getMessage());
			e.printStackTrace();	//	��ü ���� ���� ���
		}

		System.out.println("End of Code");
	}

	private static void nullPointerExceptionEx() {
		String str = new String("Hello");
		str = null;

		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.err.println("���Դϴ�.");
		}
		System.out.println("End of Code");
	}

	private static void arithmeticExceptionEx() {
		//	��ĳ�ʷκ��� ���� �Է�
		//	100�� �Է¹��� ���� ������
		double result = 0;
		int num;

		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");

		//	���� �ִ�: try -> catch -> finally
		//	���� ����: try -> finally 
		//	catch ��� ����: ���ʿ��� ��ü���� ���� -> �������� Exception����(�������� �� �ִ� ����) ���´�
		try {
			//	���� �߻� ���� ����
			num = scanner.nextInt();
			result = 100 / num;
		} catch (ArithmeticException e) {
			//	0���� ������ ���� ó�� 
			System.err.println("0���δ� ���� �� �����");
			System.err.println("�����޽���:" + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("������ �Է��� �ּ���!");
		} catch (Exception e) {	//	��� ���� ó�� Ŭ������ �θ�
			e.printStackTrace(); // ���� ��ü �޽��� ���
		} finally {
			System.out.println("����ó�� ����");
		}

		System.out.println(result);
		scanner.close();
	}

}