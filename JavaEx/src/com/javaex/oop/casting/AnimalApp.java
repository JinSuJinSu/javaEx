package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// �ڽ� Ÿ���� ��ü�� �θ� Ÿ�� Ŭ������ ������ �� �ִ�
		Dog dog1 = new Dog("Snoopy");

		dog1.eat();
		dog1.walk();
		dog1.bark();

		//	�ڽ� ��ü�� �θ� Ÿ������ �����ϴ� �� -> Upcasting
		Animal dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
//		dog2.bark();	-> Animal ���赵�� ����, ���� �Ұ�

		//	������� �������� -> �ٿ� ĳ����
		((Dog)dog2).bark();

		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();

		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();

		//	�߿�:�ٿ�ĳ���ý�, ���� ��ü�� Ȯ���ؾ� �� �ʿ�
		//	instanceof ������ Ȱ��
		if (pet instanceof Dog) {	//	pet�� DogŬ������ �ν��Ͻ�?
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {	//	pet�� CatŬ������ �ν��Ͻ�?
			((Cat)pet).meow();
		}

	}

}