package com.javaex.exception;

//	����� ���� ����
public class CustomArithmeticException extends ArithmeticException {
	//	��Ȳ ������ ���� �ʵ�
	private int num1;
	private int num2;

	//	������
	public CustomArithmeticException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	//	Getters
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}