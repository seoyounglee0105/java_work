package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3; 
		
//		System.out.println(5/4);
		double number4_1 = 5 / 4;  // 원래는 1.666... 이지만 정수 / 정수는 값이 정수로 형 변환되어 나타남 (변수의 자료형과 무관하게 소숫점 버림)
		double number4_2 = (double)5 / 4;
		double number4_3 = 5.0 / 4.0; // == 5.0 / 4 == 5 / 4.0
		int number4_4 = (int)(5.0/4.0);
   
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println("---");
		System.out.println(number4_1);
		System.out.println(number4_2);
		System.out.println(number4_3);
		System.out.println(number4_4);
		System.out.println("---");
		System.out.println(number5);
		System.out.println("======================");
		
		// 1. (12+3) / 3을 화면에 출력하시오
		int a;
		a = (12 + 3) / 3;
		System.out.println(a);
		
		// 2. (25%2)를 화면에 출력하시오
		int b;
		b = 25 % 2;
		System.out.println(b);
		
		// 3. 3.0/5를 정수값 result 변수에 담아주세요
		int result;
		result = (int) (3.0/5);
		System.out.println(result);
		
	}

}
