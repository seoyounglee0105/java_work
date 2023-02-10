package ch04;

import java.util.Scanner;

public class WhileMainTest3 {

	// 메인 작업자(메인 쓰래드)
	public static void main(String[] args) {

		// 사용자가 0을 입력하면 프로그램을 종료하게 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 더해서 sum에 담아주세요
		// do while으로 코드를 작성해주세요
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("덧셈 정수 값을 입력해주세요");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);
	
		System.out.println("연산된 결과는 " + sum + "입니다.");
		System.out.println("프로그램을 종료합니다.");
		
		
		

	} // end of main

} // end of class
