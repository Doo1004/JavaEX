package io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";
	public static void main(String[] args) {
		// Scanner는 단순히 표준입력(키보드)만을 위한 클래스가 아니다
		// 생성자의 인자로 입력 소스를 지정하면 파일, 네트워크 등 다른 입력 소스로부터 데이터를 읽어올 수 있다
		
		// 입력 소스
		File file = new File(filename);			// 파일을 입력 소스로 사용
		try {
			Scanner scan = new Scanner(file);
			String name;
			float height;
			float weight;
			
			// 더 이상 읽을 라인이 없을 때 까지 루프
			while(scan.hasNextLine()) {
				// 입력과 Parsing(변환)을 동시에 진행
				name = scan.next();
				height = scan.nextFloat();
				weight = scan.nextFloat();
				
				System.out.printf("%s, 키 : %f, 체중 : %f\n", name, height, weight);
				scan.nextLine();
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없음");
		} 
	}
}
