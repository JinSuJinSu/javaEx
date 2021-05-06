package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;	//	Ŭ���� ��� - ���� ī��Ʈ
	public static String classVar;	//	Ŭ���� ���
	public String instanceVar;	//	�ν��Ͻ� ���

	//	�ν��Ͻ� ���� -> Ŭ���� ���� ������ ����
	//	Ŭ���� ���� -> �ν��Ͻ� ���� ������ �Ұ�

	//	Ŭ���� ������ �ʱ�ȭ�� static ��Ͽ��� ����
	static {
		refCount = 0;
		classVar = "Static Member";
//		instanceVar = "Instance Member";  //	static -> instance ���� �Ұ�
		System.out.println("Static Block");
	}

	//	������ : �ν��Ͻ� �ʱ�ȭ
	public StaticEx() {
		refCount++;	//	���� ī��Ʈ ����
		System.out.println("refCount:" + refCount);
		System.out.println("�� �ν��Ͻ��� ����!");
	}

	//	�Ҹ���: ��ü�� ������ �� ȣ��
	@Override
	protected void finalize() throws Throwable {
		//	���� ī��Ʈ ���̱�
		refCount--;
		super.finalize();
		System.out.println("�Ҹ��� ȣ��");
	}

}