package ch01;

public class DataType2 {
	
	// 코드의 시작점 : main 함수
	public static void main(String[] args) {
		
		char name;  // 변수 선언 : 2byte 공간에 문자를 담을 수 있음
		char a;
		char initial;
		
		// 값 초기화 방법
		name = 'A';  // 작은따옴표를 사용해야 함
		name = 'B';
//		name = 'ab';  // 오류 (Invalid character constant) -> 하나의 문자만 담을 수 있음
		
		System.out.println(name);
		System.out.println('p');
		System.out.println('C');

	} // end of main

} // end of class
