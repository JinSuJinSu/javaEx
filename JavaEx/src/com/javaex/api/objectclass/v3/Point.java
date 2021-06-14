package com.javaex.api.objectclass.v3;


//clone 메서드를 사용하기 위해선 Cloneable 인터페이스를 구현
//얕은 복제 : 필드의 값만을 복사
//깊은 복제 : 
public class Point implements Cloneable{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point getClone() {
		Point clone = null;
		try {
			clone = (Point)clone();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return clone;
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