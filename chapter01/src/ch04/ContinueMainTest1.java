package ch04;

import java.util.Scanner;

public class ContinueMainTest1 {

	public static void main(String[] args) {
		// 무시하고 계속 진행하는 continue문
		
		// 3의 배수면 출력하지 마세요
//		for (int i = 1; i < 11; i++) {
//			if (i % 3 == 0) {
//				continue;
//			}
//			System.out.println("현재 값 : " + i); 
//		}
		
		// 스캐너를 사용해서 사용자의 정수 값을 입력 받아서 배수의 개수를 출력하는 프로그램을 만들어 보세요
		// 테스트 값 1000, 3 입력 -> 1~1000까지의 수 안에 3의 배수가 몇 개 인지
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int Multiple = sc.nextInt(); 
		System.out.println("몇 까지 확인하시겠습니까?");
		int max = sc.nextInt();
		
		int num = 0;
		int count = 0;
		
		for (num = 1; num <= max; num++) {
			if (num % Multiple == 0) {
				count++;
				continue;
			}
		}
		System.out.println("결과 값은 " + count + "개입니다.");
		
		
		

	}

}
