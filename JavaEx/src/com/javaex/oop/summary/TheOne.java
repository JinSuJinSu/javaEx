package com.javaex.oop.summary;

public class TheOne extends Human implements KungfuSkill, Flyable {
	
	public TheOne(String name, int age) {
		super(name,age);
	}
	
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.printf("%s: fly fly fly%n",name);

	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.printf("%s: I know kungfu%n",name);

	}

}
