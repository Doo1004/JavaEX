package com.java.basic;
import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
		ifElseEx3();
	}
	
	public static void ifElseEx(){
		// Scanner로 점수를 입력
		// 점수가 60점 이상이면 합격
		// 그렇지 않으면 불합격
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		// 판별(의사 결정)
		if(score >= 60 && score <= 100) {
			//비교 값이 true일 때 실행
			System.out.println("합격");
		}
		else {
			//비교 값이 false일 때 실행
			System.out.println("불합격");
		}
		scan.close();
	}
	
	public static void ifElseEx2() {
		// 정수 입력
		// 0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
		// if ~ else if ~ else
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		
/*		if(num > 0) {
			System.out.println("양수");
		}
		else if(num < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
			
		}*/
		
		
		if (num == 0) {
			System.out.println("0");
		} else {
			if (num > 0) {
				System.out.println("양수");
			} else {
				System.out.println("음수");
			}
		}
		scan.close();
	}
	
	
	public static void ifElseEx3() {
		// 과목 번호 입력
		// 1 -> R101, 2 -> R202, 3 -> R303, 4 -> R404, 나머지 -> 관리자 문의
		Scanner scan = new Scanner(System.in);
		
		System.out.println("과목번호를 입력하세요 : ");
		int sub = scan.nextInt();
		
		if(sub == 1) {
			System.out.println("R101");
		} else if(sub ==2) {
			System.out.println("R202");
		} else if(sub ==3) {
			System.out.println("R303");
		} else if(sub ==4) {
			System.out.println("R404");
		} else {
			System.out.println("관리자에게 문의");
		}
		scan.close();
	}
}
