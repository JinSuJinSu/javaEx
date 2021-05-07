package com.javaex.oop.summary;

public class Panda extends Animal{
	public Panda(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void say() {
		System.out.printf("zzz, I'm %s%n zzz",name);
	}

}



