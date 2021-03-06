package com.java.basic;
import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		ifElseEx3();
//		switchEx();
//		switchEx2();
//		whileEx();
//		whileEx2();
//		whileEx3();
//		doWhileEx();
//		forEx();
//		continueEx();
//		breakEx();
//		randomEx();
	}
	
	// 반복의 횟수를 알 수 있을 떄 for
	// 반복의 횟수를 알 수 없을 떄 while
	
	
	
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
	
	
	public static void switchEx() {
		// ifElseEx3 과 동일한 내용을 switch
		// switch는 전달받은 변수의 값을 이용하여 흐름을 제어(==)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 : c, 2 : c++, 3 : Java, 4 : Python - ");
		
		int code = scan.nextInt();
		switch(code) { //switch는 변수의 값을 비교 흐름 제어
		case 1 : // code == 1
			System.out.println(" c ");
			break;	// break을 잊지 말 것
		case 2 : // code == 2
			System.out.println(" c++");
			break;
		case 3 :
			System.out.println("Java");
			break;
		case 4 :
			System.out.println("Python");
			break;
			
			default : // else 위에 case 문에서 일치하는 결과가 없을 때
				System.out.println("관리자에게 문의");
		}
		scan.close();
	}
	
	
	public static void switchEx2() {
		// 월 정보(정수)입력
		// 1, 3, 5, 7, 8, 10, 12 -> 31일
		// 2 = 28일
		// 4, 6, 9, 11 -> 30일 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 입력 : ");
		int mon = scan.nextInt();
		String days = "";
		
		switch (mon) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12:
			days = "31일";
			break;
			
		case 2 :
			days = "28일";
			break;
			
		case 4 :
		case 6 :
		case 9 : 
		case 11:
			days = "30일";
			break;
			
		default :
			days = "?";
		}
		System.out.println(days);
		scan.close();
	}
	
	
	public static void whileEx() {
		// 반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
		int num = 1;		// 시작값, 조건 비교
		int total = 0;		// 합산 변수
		
		// while loop
		while (num <= 100) {		// num이 100 이하인 동안 반복
			total += num;			// total = total + num
			// 주의 : while문은 반복 조건을 개발자가 직접 컨트롤 해줘야 한다
			num++;
		}
		System.out.println("합산값 : " + total);
	}
	
	
	public static void whileEx2() {
		// 단수를 입력, 해당 단의 곱셈표를 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력 : ");
		int dan = scan.nextInt();
		// 제어용 변수
		int i = 1;
		
		while(i <= 9) {		// 9 이하일 동안 반복
			System.out.println(dan + " * " + i + " = " + (dan * i));
			// 종료를 위한 제어변수를 잘 제어하기
			i++;
		}
		scan.close();
	}
	
	
	public static void whileEx3() {
		/*
		 * while은 종료를 위한 제어 변수를 잘 제어하여
		 * 무한루프에 빠지지 않도록 해야 한다
		 * 경우에 따라서는 의도적으로 무한루프를 사용하기도 한다
		 */
		while(true) { 	//조건이 true이면 항상 반복
			System.out.println("무한루프...Ctrl + C to Quit");
		}
	}
	
	
	public static void doWhileEx() {
		// 숫자를 입력받아서 합산
		// 0을 입력받으면 반복 종료
		
		int num = 0;
		int total = 0;	// 합산 변수
		
		Scanner scan = new Scanner(System.in);
		
		// 최소 한 번을 실행해야 하는 반복 do ~ while
		// or 반복 조건이 loop문 내부에서 결정되는 경우 do ~ while
		do { // 일단 실행
			System.out.println("정수 입력(0이면 종료)");
			num = scan.nextInt();
			total += num;
		}  while(num != 0);
		
		System.out.println("합산 값 : " + total);
		scan.close();
	}
	
	
	public static void forEx() {
		// 문법 내에 제어 변수 초기화, 반복 조건, 증감식을 모두 포함
		// 1. 반복 횟수가 정해져 있을 때
		// 2. 제어 변수를 for문이 해주기 때문에 while보다 안전
		
		// 단수를 입력, 해당 단의 곱셈표를 출력(for문 버전)
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int dan = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			// 내용 출력
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		scan.close();
	}
	
	
	public static void continueEx() {
		// 1부터 100까지 for loop
		// 2의 배수이거나 3의 배수면 출력하지 않음
		// 나머지는 출력
		for (int i = 1; i <= 100; i++) {
			
			// 만약 반복문 중간에 continue를 만나게 되면 남은 구문은 실행하지 않고 다음번 루프
			
			if (i % 2 == 0 || i % 3 == 0) {
				// 아래 남은 코드는 실행되지 않고 다음 루프 진행
				continue;
			}
			System.out.println(i);
		}
	}
	
	
	public static void breakEx() {
		// 1부터 루프를 돌려서 6과 14로 모두 나누어 떨어지는 수는 얼마?
		// 어디까지 루프를 돌려야 할 지 예측이 쉽지 않으니 while
		int num = 1;
		while(true) {
			if(num % 6 == 0 && num % 14 == 0) {
				break; // 루프 탈출
			}
			num++;
		}
		System.out.println(num);
	}
	
	
	public static void randomEx() {
		//복수번의 랜덤 (1 ~ 6)을 뽑아서 합산
		int rollCnt = 6;	//횟수
		int total = 0;		// 합산변수
		
		for (int i = 1; i <= rollCnt; i++) {
			//랜덤으로 주사위 값을 추출
			int num = (int)(Math.random()*6) + 1;
			
		}
	}
}
