package com.javaex.api.collection.list;

import java.util.Stack;

//	Stack �ڷ���: �Է°� ����� ���� ���⿡���� �̷������
//		�߰��� ����, ���� �Ұ�
public class StackEx {

	public static void main(String[] args) {
		//	Stack ����
		Stack<Integer> stack = new Stack<>();

		//	10�� �����͸� �Է�
		for (int i = 1; i <= 10; i++) {
			//	���ؿ� ������ �Է� : push
			stack.push(i);
			System.out.println("PUSH:" + stack);
		}

		//	���� ���� ������ Ȯ�� : peek -> �������� ����
		System.out.println("PEEK:" + stack.peek());
		System.out.println("Stack:" + stack);

		//	�������� ���� : pop -> ���� ����
		System.out.println("POP:" + stack.pop());
		System.out.println("Stack:" + stack);

		//	����: ����ִ� stack���� pop -> EmptyStackException
		while(!stack.empty()) {	//	������ ������� ������ ����
			System.out.println("POP:" + stack.pop());
			System.out.println("Stack:" + stack);
		}

	}

}