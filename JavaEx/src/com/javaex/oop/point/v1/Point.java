package com.javaex.oop.point.v1;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("Á¡[x=%d, y=%d]À» ±×·È½À´Ï´Ù.%n", x,y);
	}

}