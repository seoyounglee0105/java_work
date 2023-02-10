package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {

		System.out.println("성적을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		char result = 'Z';
		
		if (point <= 100 && point >= 90) {
			result = 'A';
		} else if (point < 90 && point >= 80) {
			result = 'B';
		} else if (point < 80 && point >= 70) {
			result = 'C';
		} else if (point < 70 && point >= 60) {
			result = 'D';
		} 
		
		// 방어적 코드 작성 (실행 결과가 잘못 나왔을 때를 대비함)
		if (result == 'Z') {
			System.out.println("값을 잘못 입력하였습니다.");
		} else {
			System.out.println(result + " 학점입니다.");			
		}
		
		
	} // end of main

} // end of class
