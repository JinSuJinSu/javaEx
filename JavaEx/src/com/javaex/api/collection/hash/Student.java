package com.javaex.api.collection.hash;

//	��ü ����� ��
//	1. ��ü�� hashCode()�� ��ȯ���� ��
//	2. ��ü�� equals() �޼���� ���� ���ϼ��� ��
//	1, 2 ������ ��� ����ϸ� �� ��ü�� ������ ��ü�� �Ǻ�
public class Student {
	String name;
	int id;	//	�й�

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		// ��ü �ĺ��� ���� �ϳ��� ������
		return id; 	//	�л��� �й����� �ĺ��� �� �ִ�
	}

	@Override
	public boolean equals(Object obj) {
		// �� Student ��ü�� �ʵ尪�� ��
		if (obj instanceof Student) {
			Student other = (Student)obj;
			return name == other.name && id == other.id;
		}
		return super.equals(obj);
	}


}