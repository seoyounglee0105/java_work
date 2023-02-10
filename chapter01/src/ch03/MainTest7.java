package ch03;

import java.util.Scanner;  // 예약어 import (수입하다, 가져오다) - 자바 개발자들이 사용하라고 미리 만들어둔

public class MainTest7 {

	public static void main(String[] args) {
		
		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;
		
		int num1 = ( 5 > 3 ) ? 10 : 20;
//		System.out.println(num1);

		int max = 0;
		System.out.println("입력 받은 두 수 중 큰 수를 출력하시오");
		
		// JDK에 만들어 둔 도구
		// Scanner : 입력장치  - 참조 자료형의 한 종류
		// sc : Scanner의 이름으로 임의로 지정한 것
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x = sc.nextInt();  // Scanner의 기능인 nextInt() : 사용자가 키보드로 입력한 정수 값을 받아들임
		
		System.out.println("입력 2 : ");
		int y = sc.nextInt();
		
		System.out.println("======================");
		
		int result = (x > y) ? x : y;
		System.out.println("더 큰 숫자는 " + result + "입니다.");
		
	}

}
