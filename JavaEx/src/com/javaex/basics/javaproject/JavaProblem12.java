package com.javaex.basics.javaproject;
import java.util.ArrayList;



public class JavaProblem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~45 임의의 숫자 6개를 출력하시오
		

		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for(int i=1; i<=6; i++) {
			int number = (int)(Math.random()*45)+1;
			
			
			if(numArray.contains(number)) {
				while(true) {
					number = (int)(Math.random()*45)+1;
					if(numArray.contains(number)) {
						//pass
					}
					else {
						numArray.add(number);
						break;
					}
				}
			}
			else {
				numArray.add(number);
			}
			
			
			
		}
		
		for(int vlaue:numArray) {
			System.out.print(vlaue+"\t");
		}
		
	
		
		
		
		

	}

}
