package ch04;

import java.util.Scanner;

public class IfMainTest1 {

	public static void main(String[] args) {
		// 제어문 (코드 실행의 흐름을 제어함) - if
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현
		// 만약 ~ 라면

		boolean flag = false; // 상황에 따라 어떻게 실행하라는 의미로 flag 변수명을 자주 이용함

		// if 문 단독
		if (/* 조건식 */ flag) {
			System.out.println("조건식의 결과가 true면 여기 코드가 수행됩니다.");
		} // end of if

		// if else 문
		if (flag) {
			System.out.println("true면 실행 !");
		} else {
			System.out.println("false면 실행 @");
		}
		
		System.out.println("성적을 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		// 90점 이상이면 A 학점입니다 출력
		// 80점 이상이면 B 학점입니다 출력
		// 70점 이상이면 C 학점입니다 출력
		
		if (point >= 90){
			System.out.println("A 학점입니다.");
		} else if (point >= 80) {
			System.out.println("B 학점입니다.");
		} else if (point >= 70) {
			System.out.println("C 학점입니다.");
		} else if (point >= 60) {
			System.out.println("D 학점입니다.");
		} else {
			System.out.println("F 학점입니다.");
		} // end of if
		

	} // end of main

} // end of class
