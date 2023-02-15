package ch08;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요.");
		int num1 = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요.");
		int num2 = scanner.nextInt();
		
		// 1번 : try-catch로 예외처리하기
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		// 2번 : throws 키워드 사용해서 예외처리하기
		DivisionManager divisionManager = new DivisionManager();
		
		try {
			int result = divisionManager.division(num1, num2);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
	} // end of main

	
} // end of class

class DivisionManager {
	
	public int division(int n1, int n2) throws ArithmeticException {
		return n1 / n2;
	}
}