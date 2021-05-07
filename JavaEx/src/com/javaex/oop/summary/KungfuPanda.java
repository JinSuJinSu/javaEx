package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill{
	public KungfuPanda(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void say() {
		System.out.printf("hey man, I'm %s%n",name);
	}
	
	@Override
	public void kungfu() {
		System.out.printf("%s: ¿Â«≥!!!%n",name);
	}

}



