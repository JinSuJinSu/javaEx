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
			System.out.println("TV를 키겠습니다.");
			power=true;
		}
		else {
			System.out.println("TV를 끄겠습니다.");
			power=false;
		}
	}
	
	public void channel(int channel) {
		if(channel>=1 && channel<=255) {
			this.channel = channel;
		}
		else {
			System.out.println("TV 채널 에러 발생!! 채널은 정확하게 입력하세요!!");
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
			System.out.println("TV 볼륨 에러 발생!! 볼륨은 정확하게 입력하세요!!");
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
			System.out.println("채널 : "+channel);
			System.out.println("볼륨 : "+volume);
		}
		else {
			System.out.println("TV는 현재 꺼져있습니다.");
		}
		
		
	}
	
	

	
	

}