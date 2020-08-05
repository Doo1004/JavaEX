package com.java.basic;

// 연산자 연습
public class OperEx {
	
	public static void main(String[] args) {
		arithOper();
	}
	
	
	
	
	
	// 산술연산자
	public static void arithOper() {
		// 사칙연산 : +, * , - , /
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 = " + (7/3));
		// int / int = int(몫)
		System.out.println("7 / 3의 몫 = " + (7%3));
		//나머지 연산자 " %
		
		// 정확한 실수 값을 얻으려면 int = float로 변환
		float result = a / b;
		
		System.out.println("7 / 3 의 실수 = " + ((float)a) / ((float)b));
		
		
		// 만일 정수를 0으로 나누려면
		// ArithmeticException
		System.out.println("정수 나누기 0 = " + (a / 0));
	}
}
