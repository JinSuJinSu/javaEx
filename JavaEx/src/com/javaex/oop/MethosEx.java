package com.javaex.oop;

public class MethosEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMessage();
		System.out.println("SQUARE: " + square(2));
		System.out.println("4 + 5 = " + getSum(4,5));
	}
	
	private static double square(double num) {
		return num*num;
	}
	
	private static double getSum(double num1, double num2) {
		return num1+num2;
	}
	
	private static void printMessage() {
		System.out.println("java java");
	}

}
