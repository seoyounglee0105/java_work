package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		// long - 8byte
		// int - 4byte
		// 작은 메모리 공간에서 큰 메모리 공간으로 옮길 때는 자동 형 변환됨
		// 그 반대의 경우엔 강제 형 변환시켜야 함
		
		long l = 100;   // 자동 형 변환
		// R value : 정수 값에 기본 연산 단위인 int 자료형
		// L value : long 자료형에 int 자료형 데이터를 넣는 것이므로, 자동 형 변환
		System.out.println("l : " + l);

		// --------------
		char myA = 'A';
		char yourA = 'a';
		System.out.println( (int)myA );  // 	65
		System.out.println( (int)yourA );  // 97
		
		System.out.println( (short)myA ); // 같은 메모리 크기 간의 형 변환도 강제 형 변환 방식으로
		
		// -------------- 연산자
		
		// 대입 연산자 (=), 연산 방향 : 오른쪽 -> 왼쪽
		int number = 10;
		// 변수에 변수를 대입할 수 있음
		int number2 = number;
		System.out.println(number2);
		
	   System.out.println("=======================");
		
		// 부호 연산자 (+, -)
		// 항이 하나인 연산자
		System.out.println(-number);
		System.out.println(number);
		// ==> 변수에 있는 실제 값을 변경한 것은 아님 (변경하려면 대입)
		
		number = -number;
		System.out.println(number);
		
	} // end of main

} // end of class
