package com.javaex.basics.javaclassproject;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서 100까지의 수에서 5의배수이면서 7의 배수인것을 출력하시오
		
		TV tv = new TV(7,20,false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
