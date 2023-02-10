package ch04;

import java.util.Scanner;

public class WhileMainTest2 {

	// 메인 작업자(메인 쓰래드)
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
//		do {
//			// 조건에 관계 없이 한 번은 수행되고, 그 다음부터 조건에 따라 반복
//			System.out.println("현재 값 : " + num);
//			num++;
//		} while (num <= 10);

		
		Scanner sc = new Scanner(System.in);
		int userInput = -1;
		
		do {
			// 한 번 코드를 수행하고 다시 사용자 입력 값을 받고 싶다면
			System.out.println("값을 입력 하세요.");
			userInput = sc.nextInt();
			sum += userInput;
			System.out.println("연산된 값 : " + sum);
		} while (true);
	
	
		// 문제 : 사용자가 0을 입력하면 프로그램을 종료하는 코드 만들기
		
//		while (userInput != 0) {
//			System.out.println("값을 입력 하세요.");
//			userInput = sc.nextInt();		
//		}
//		System.out.println("프로그램이 종료되었습니다.");
		
		
		
		
		
//		while(true) {
//			System.out.print("-");
//			
//			// 예외처리
//			try {
//				// 작업자(Thread)에게 1초씩 잠들라고 명령 (단위 : 밀리세컨드)
//				Thread.sleep(100);
//			} catch (Exception e) {
//			}
//		}
		

		
		
	} // end of main

} // end of class
