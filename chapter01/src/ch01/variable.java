package ch01;

public class variable {  // 클래스

	// 중괄호 (블록)의 범위는 절대적임
	public static void main(String[] args) {  // main : 프로그램의 시작점
		// main 함수는 위에서 아래로 순차적으로 진행됨
		
		// 변수를 사용하는 방법
		int age;  // 변수 선언
		int count;
		
		// 대입 연산자 =
		age = 1;  // 변수를 초기화함 (값을 부여함)
		count = 100;  // 구문의 끝은 세미콜론(;)
		
		// 화면에 age라는 변수에 담겨 있는 값을 출력해줘!
		System.out.println(age);
		System.out.println(count);
		System.out.println("=================");
		
		// 변수는 변할 수 있는 수
		age = 500;
		count = 300;
		
		System.out.println(age);
		System.out.println(count);
		System.out.println("=================");
		
		// 변수의 선언과 초기화  (변수명 = myAge)
		int myAge = 800; 
		System.out.println(myAge);  // sysout 입력 and [Ctrl] + [Space] (코드 힌트)
		System.out.println(9000);    // 라인 복사 : [Ctrl] + [Alt] + [방향키 ↓]
		
		// Tip : 변수 사용 시 데이터 타입은 크게 2가지
		// 1. 기본 데이터 타입
		// 2. 참조 타입
			
		
	}  // end of main

}  // end of class
