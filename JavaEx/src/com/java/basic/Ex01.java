package com.java.basic;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Input text : ");
		Scanner scan = new Scanner(System.in);
		String input_a;
		input_a = scan.nextLine();
		
		String input_b;
		input_b = scan.nextLine();
		
		
		System.out.printf(input_a+input_b);
	}
}
