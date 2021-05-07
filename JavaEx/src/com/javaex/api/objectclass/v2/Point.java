package com.javaex.api.objectclass.v2;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("Point(%d, %d)", x,y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point other = (Point)obj;
			return x== other.x && y==other.y;
		}
		return super.equals(obj);
	}
	
	
	
	}
