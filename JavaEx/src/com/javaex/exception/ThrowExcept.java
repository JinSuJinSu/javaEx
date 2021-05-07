package com.javaex.exception;

import java.io.IOException;


//	������ �� ����
//	���� 1. checked Exception -> �ݵ�� ����ó���� ����� �Ѵ�
//	���� 2. runtime Exception -> ���� ó���� �� ���� �ʾƵ� �ȴ�
public class ThrowExcept {
	//	Checked Exception
	public void executeException() throws IOException {
		System.err.println("���� ���� �߻�");
		throw new IOException("��������");
	}

	//	Unchecked Exception
	public void executeRuntimeException() {
		System.err.println("���� ��Ÿ�� ����");
		throw new RuntimeException("��Ÿ�� ����");
	}

	public double divide(int num1, int num2) {
		double result = 0;

		try {
			//	�Ϲ����� ���� -> ��ü���� "���� ��ȯ"�ؼ�
			//	���� ��Ȳ������ ��Ȳ ������ ��� �ִ� ���� ����
			result = num1 / num2;
		} catch (ArithmeticException e) {
			//	��ü���� ���� ��ȯ �ٱ����� throw
			System.err.print("������ ��ȯ");
			throw new CustomArithmeticException("����� ���� ����", 
					num1, num2);
		}
		return result;
	}
}