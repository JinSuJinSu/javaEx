package com.javaex.api.arrayclass;

//	����� ���� ��ü�� �񱳸� ���ؼ��� Comparable �������̽� ����
public class Member implements Comparable {
	String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		//	����� 0�̸� �� ��ü�� ������ ����
		//		-1�̸�(����) ���� ��ü�� ����
		//		1�̸�(���) ���� ��ü�� ���� 
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}


}