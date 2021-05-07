package com.javaex.api.objectclass.v3;


//clone �޼��带 ����ϱ� ���ؼ� Cloneable �������̽��� ����
//���� ���� : �ʵ��� ������ ����
//���� ���� : 
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
