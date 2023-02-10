package ch06;

public class Lion {

	// 함수를 설계(선언)하는 코드

	// 함수의 형태 1 : 값을 반환하는 함수
	// 함수 선언부
	static int addNumber(int n1, int n2) { // 포지셔널 : 매개변수의 순서를 명확히 해서 사용하기
		// 함수 구현부 (body)
		int result; // 지역변수

		result = n1 + n2;
		return result; // 함수 선언부의 자료형과 return 데이터의 자료형이 동일해야 함 !
		// return 키워드를 만나면 실행의 제어권을 반납하며 데이터를 반환함
		// 함수를 호출했던 위치로 실행의 제어권이 다시 되돌아감

	} // end of function

	// 함수의 형태 2 : 값을 반환하지 않는 함수 (void 자료형 사용)
	static void sayHello(String name) {
		System.out.println(name + "님 반갑습니다 ~ ");
	}

	// 함수의 형태 3 : 매개변수가 없는 함수
	static int calcSum() {

		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}

		return sum;
	}

	// 문제 : calcSum2 함수, 정수 값 3개를 받아 덧셈 연산 후 결과를 리턴

	static double calcSum2(int a, int b, int c) {
		double result = a + b + c;
		return result;
	}

	// 문제 : calcSum3 함수, 정수값 1개, 실수값 1개, 논리값 1개를 받고
	// 리턴) "정수 값 [], 실수 값 [], 논리값 []" (문자열로 반환)

	static String calcSum3(int a, double b, boolean c) {
		String result = "정수 값 [" + a + "], " + "실수 값 [" + b + "], " + "논리 값 [" + c + "]"; // 문자열 연산에서는 하나라도 문자열이라면 모두
																							// 문자열 타입으로 취급됨
		return result;
	}

	// 코드의 시작점 main 함수
	// void : 자료형 -> 텅 빈, return 값이 없는.
	public static void main(String[] args) {
		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
//		System.out.println("myNumber : " + myNumber);

		// 함수 호출하기
//		String a = sayHello(); // 오류(Type mismatch) : 함수의 리턴자료형이 void인데 String 변수에 대입하려고 해서 오류
//		sayHello("애쉬");

		// 함수 호출은 모양 맞추기 (매개변수가 선언된 함수에는 매개변수를 꼭 입력해서 호출해야 함)

//		int calResult = calcSum();
//		System.out.println(calResult);
//		// ==
//		System.out.println(calcSum());

		System.out.println(calcSum2(1, 2, 3));
		System.out.println(calcSum3(1, 2.0, true));

		// 함수 - static 키워드로 구분
		// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련의 코드 묶음
		
	} // end of main

} // end of class
