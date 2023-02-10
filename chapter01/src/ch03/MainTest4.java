package ch03;

public class MainTest4 {

	public static void main(String[] args) {
		// 증감 연산자
		// 증가 연산자++, 감소 연산자--

		int num1 = 1;  // 변수의 선언과 초기화
		
		num1++;
		System.out.println(num1);
		System.out.println("---------------");
		
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		num4 = num3++;
		System.out.println(num4);
		
		// 2. 증감 연산자가 앞에 올 경우
		int num5 = 10;
		int num6;
		
		num6 = ++num5;
		System.out.println(num6);
		
		// 감소 연산자 사용해 보기
		num3 = num4--;
		
		num3 = --num4;
		
	}

}
