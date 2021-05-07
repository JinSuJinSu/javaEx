package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KungfuSkill dojang[];
		
		Human h1 = new Human("��浿",50);
		Human h2= new TheOne("�׿�",40);
		Panda p1 = new Panda("�Ǵ��� ������",30);
		Panda p2 = new KungfuPanda("�Ǵ��� ����",30);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		
		
		//	Kungfu �� �� �ִ� ��ü�� dojang
		dojang = new KungfuSkill[] {
//				(KungfuSkill)h1,	//	-> KungfuSill�� �������� ����
				(KungfuSkill)h2,
//				(KungfuSkill)p1,
				(KungfuSkill)p2
		};

		for (KungfuSkill actor:dojang) {
			actor.kungfu();
		}
	}
		

	
	
	private static void fight(Animal actor) {
		if(actor instanceof KungfuSkill) {
			((KungfuSkill)actor).kungfu();
		}
		else {
			System.out.println(actor.name + " : ��Ǫ ���Ѵ� ���� �ΰ���!!");
		}
	}
	
	private static void fly(Animal actor) {
		if(actor instanceof Flyable) {
			((Flyable)actor).fly();
		}
		else {
			System.out.println(actor.name + " : ���� �� �Ѵ� ���� �ΰ���!!");
		}
	}

}
