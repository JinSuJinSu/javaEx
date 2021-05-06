package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// ȣ�� ���� : static ��� -> ������
		//			�� ��° ���ʹ� static�� ȣ�� �ȵ�
		StaticEx s1 = new StaticEx();
		System.out.println("���� ī��Ʈ:" + StaticEx.refCount);	//	s1.refCount
		//	static ����� ��ü ����(new) ���̵� ������ �� �ִ�

		StaticEx s2 = new StaticEx();
		System.out.println("���� ī��Ʈ:" + StaticEx.refCount);

		//	���� ����
		s1 = null;
		System.out.println("s1 ����!");
		System.out.println("���� ī��Ʈ:" + StaticEx.refCount);
		//	������ GC ȣ��
		//	����: �ڹٰ� ��ü�� �����ϴ� ������ �����帮�� ���� �ڵ�
		//		������ Garbage Collector�� ȣ�������� ����!
		System.gc(); //	���� �ڵ�θ� Ȱ��!
		try {
			Thread.sleep(3000);	//	3�� ���
			System.out.println("���� ī��Ʈ:" + StaticEx.refCount);
		} catch (Exception e) {

		}
	}

}