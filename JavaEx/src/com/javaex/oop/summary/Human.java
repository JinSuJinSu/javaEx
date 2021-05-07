package com.javaex.oop.summary;

public class Human extends Animal{
	public Human(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void say() {
		System.out.printf("hey man, I'm %s%n",name);
	}

}
