package com.javaex.basics.javaclassproject;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void power(boolean on) {
		if(on==true) {
			System.out.println("TV�� Ű�ڽ��ϴ�.");
			power=true;
		}
		else {
			System.out.println("TV�� ���ڽ��ϴ�.");
			power=false;
		}
	}
	
	public void channel(int channel) {
		if(channel>=1 && channel<=255) {
			this.channel = channel;
		}
		else {
			System.out.println("TV ä�� ���� �߻�!! ä���� ��Ȯ�ϰ� �Է��ϼ���!!");
		}
	}
	
	
	public void channel(boolean up) {
		if(up==true) {
			if(channel<255) {
				channel+=1;
			}
			else {
				channel=1;
			}
			
		}
		else {
			if(channel>1) {
				channel-=1;
			}
			else {
				channel=255;
			}
		}
	}
	
	
	public void volume(int volume) {
		if(volume>=0 && volume<=100) {
			this.volume = volume;
		}
		else {
			System.out.println("TV ���� ���� �߻�!! ������ ��Ȯ�ϰ� �Է��ϼ���!!");
		}
	}
	
	
	public void volume(boolean up) {
		if(up==true) {
			if(volume<100) {
				volume+=1;
			}
			else {
				volume=100;
			}
			
		}
		else {
			if(volume>0) {
				volume-=1;
			}
			else {
				volume=0;
			}
		}
	}
	
	public void status() {
		if(power==true) {
			System.out.println("ä�� : "+channel);
			System.out.println("���� : "+volume);
		}
		else {
			System.out.println("TV�� ���� �����ֽ��ϴ�.");
		}
		
		
	}
	
	

	
	

}
