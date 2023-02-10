package ch11;

import java.util.Scanner;

public class SeoyoungTest1 {

	public static void main(String[] args) {
		// 시작 값과 종료 값을 입력 받아서 이중 for 문으로 구구단을 출력하는 프로그램
		
		// 도구 준비
		Scanner scanner = new Scanner(System.in);
		
		// 시작 값 입력 받기
		System.out.println("시작 값을 입력해주세요.");
		int startNum = scanner.nextInt();
		
		// 종료 값 입력 받기
		System.out.println("종료 값을 입력해주세요.");
		int endNum = scanner.nextInt();
		
		for (int i = startNum; i <= endNum; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
	} // end of main

} // end of class
