package com.javaex.api.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// ������ ���� - ���� ����� ���� ������ ó��
		Vector<Integer> v = new Vector();
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());

		//	1���� 10������ ���� ��ƺ��ô�
		for (int i = 1; i <= 10; i++) {
			//	���� �߰�: ��ü�� ���� �� �ִ�
			v.addElement(i);
			//	= v.addElement(Integer.valueOf(i));	
		}
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());

		v.addElement(11);	//	��뷮 �ڵ� ����
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());

		System.out.println("v:" + v);

		v.insertElementAt(12, 5); //	12��ü�� 5�� �ε����� �߰�
		System.out.println("v:" + v);

		//	��ü ��ȸ: Ư�� �ε����� ��ü ��ȸ
		System.out.println("�ε��� 5�� ��ü:" + v.elementAt(5));

		//	��ü �ε��� ��ȸ:
		System.out.println("��ü 12�� �ε���:" + v.indexOf(12));
		//	���� ��ü�� �ε��� ��ȸ: -1
		System.out.println("���� ��ü�� �ε���:" + v.indexOf(0));

		//	���� ���� Ȯ��
		System.out.println("v�� 10�� ����? " + v.contains(10));

		//	���� ��ҵ带 ������ ����
		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		//	TODO: Loop ����

		//	���� ����
		v.clear();
		System.out.println("v:" + v);
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());
	}

}