package ch02;

public class ConstantTest {

	// 코드의 시작점 : main 함수
	public static void main(String[] args) {
		// 변수 != 상수
		// 상수 : 변하지 않는 수
		// 권장 사항: 상수명은 대문자로 사용하고, 단어를 연결할 때는 '_' 활용

		// 상수의 선언과 초기화
		final int MAX_NUM = 12;
//		MAX_NUM = 200;  // 오류 (The final local variable MAX_NUM cannot be assigned.)
		// 상수의 경우, 이미 초기화된 값은 변경할 수 없음
		
		final int MIN_NUM;  // 상수의 선언 (주기억장치에 4byte 만큼의 메모리 할당)
		MIN_NUM = 1;  // 상수의 초기화
		
		// ==> 상수는 선언 후에 단 한 번만 초기화할 수 있음
		
		// 상수와 리터럴을 구분할 수 있어야 함
		
		
	}  // end of main

} // end of class
