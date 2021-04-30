package com.javaex.basics;

public class Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// longTypes();
		// floatTypes();
		// charEX();
		constantEx();

	}
	private static void longTypes() {
		long longVar1 = 2021L;
		long longVar2 = 12345678901234L;
		System.out.println("longVar1:"+longVar1);
		System.out.println("longVar2:"+longVar2);
		
        int bin = 0b1101;
        int oct = 072;
        int hex = 0xFF;
        
        System.out.println("0b1101->" + bin);
        System.out.println("072->" + oct);
        System.out.println("0xFF->" + hex);
        

	}
	
	private static void floatTypes() {
		//�Ǽ� ����
		float num1 = 3.12345f;
		double num2 = 3.12345;
		System.out.println(num1+num2);
		
		int powerNum = 3000000;
		num1 = 3E6F;
		num2 = 3E-6;
		System.out.println(num1);
		System.out.println(num2);

        

	}
	
	private static void charEX() {
		//�� ���� �Ǻ�
		char ch1 = 'A';
		char ch2 = '��';
		System.out.println(ch1);
		System.out.println(ch2);
	

        

	}
	
	
	private static void constantEx() {
		//�� ���� �Ǻ�
		float PI = 3.14159f;
		final int SPEED_LIMIT = 110;
		int speed = 105;
		
		boolean overspeed = speed>SPEED_LIMIT;
		System.out.println(overspeed);
		
		
	

        

	}


}
