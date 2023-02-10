package ch03;

public class MainTest6 {

	public static void main(String[] args) {
		// 논리 연산자 (&&, ||) 엠버센트&, 버티컬 바|
		// 논리 곱 &&
		// 논리 합 ||
		// 논리 부정 !
		// 연산의 결과 값은 true, false
		// 보통 비교 연산자와 함께 많이 사용됨
		
		int num1 = 10;
		int num2 = 20;
		
		// true && true == true
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		
		// true || true == true
		boolean flag2 = (num1 > 0) || (num2 > 0);
		System.out.println(flag2);
		
		// true && false == false
		flag1 = (num1 > 0) && (num1 < 0);
		System.out.println(!(flag1));  // !false == true
		
		// true || false == true
		boolean flag3 = (num1 > 0) || (num2 < 0);
		System.out.println(flag2);
		
		// 논리곱에서는 하나라도 거짓이 있으면 연산 결과는 false
		// 논리합에서는 하나라도 참이 있으면 연산 결과는 true
		
	;
		
		

	}

}
