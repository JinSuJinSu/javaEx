package com.javaex.basics.javaclassproject;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 100������ ������ 5�ǹ���̸鼭 7�� ����ΰ��� ����Ͻÿ�
		
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
