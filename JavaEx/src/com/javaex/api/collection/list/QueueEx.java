package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	//	�Է� ����� ��� ������ �ݴ�
	//	First Input First Output(FIFO)
	public static void main(String[] args) {
		//	��ü Ŭ������ ����
		Queue<Integer> queue = new LinkedList<>();

		//	�������� ����
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
			System.out.println("OFFER:" + queue);
		}

		System.out.println("PEEK:" + queue.peek());	//	��ȸ��
		System.out.println("QUEUE:" + queue);

		while(!queue.isEmpty()) {	//	ť�� ������� ������ ����
			System.out.println("POLL:" + queue.poll());	//	���� �� ����
			System.out.println("QUEUE:" + queue);
		}
	}

}