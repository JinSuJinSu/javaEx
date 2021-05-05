package com.javaex.basics.javaproject;



public class JavaProblem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열의 공백을 ,로 바꿔서 출력하세요
		
		char[] array = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(char letter:array) {
			System.out.print(letter);
		}
		System.out.println();
		
		String str = new String(array);
		str= str.replace(" ", ",");
		
		System.out.println(str);

		
		
		
		

	}

}
