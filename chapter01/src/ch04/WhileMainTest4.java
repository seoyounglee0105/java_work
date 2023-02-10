package ch04;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		final int USER_INPUT;
		Scanner sc = new Scanner(System.in);
		System.out.println("덧셈 정수 값을 입력해주세요");
		USER_INPUT = sc.nextInt();
		
		while (num <= USER_INPUT) {
			sum += num;
			num++;
			
		}
		System.out.println("연산의 결과는 " + sum + "입니다");
	}

}
