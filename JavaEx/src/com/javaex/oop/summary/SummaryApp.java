package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KungfuSkill dojang[];
		
		Human h1 = new Human("고길동",50);
		Human h2= new TheOne("네오",40);
		Panda p1 = new Panda("판다의 오른팔",30);
		Panda p2 = new KungfuPanda("판다의 왼팔",30);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		
		
		//	Kungfu 할 수 있는 객체를 dojang
		dojang = new KungfuSkill[] {
//				(KungfuSkill)h1,	//	-> KungfuSill을 구현하지 않음
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
			System.out.println(actor.name + " : 쿵푸 못한다 망할 인간아!!");
		}
	}
	
	private static void fly(Animal actor) {
		if(actor instanceof Flyable) {
			((Flyable)actor).fly();
		}
		else {
			System.out.println(actor.name + " : 날지 못 한다 망할 인간아!!");
		}
	}

}
