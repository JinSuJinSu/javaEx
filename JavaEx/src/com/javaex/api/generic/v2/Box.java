package com.javaex.api.generic.v2;

//	V2.
//	Generic �̿�, ����ÿ��� ������ Ÿ���� �������� �ʰ�
//		�ν��Ͻ�ȭ �� �� �ܺο��� ������ Ÿ���� ����
//	Ÿ�� ���ڴ� T�� �ʿ�� ����
//	���� ����ϴ� �Ķ���� ����
//	T : Type - ������ Ÿ��
//	R : Return Type - ��ȯ Ÿ��
//	K : Key
//	V : Value
//		-> ��ܵ� ��� ������, �������̸� ���� ��Ű���� �սô�
public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}


}