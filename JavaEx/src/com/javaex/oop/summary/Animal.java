package com.javaex.oop.summary;

public abstract class Animal {
	// �ʵ�
	protected String name;
	protected int age;
	
	// ������
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public abstract void say();
	
	public void eat() {
		System.out.printf("%s is eating...%n",name);
	}

}
