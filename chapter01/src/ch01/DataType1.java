package ch01;

public class DataType1 {
	// 코드 시작점 : main 함수
	public static void main(String[] args) {
		// 데이터 타입의 종류 (크게 2가지)
		// 1. 기본 데이터 타입 (primitive data type)
		// 2. 참조 타입 (Reference type)
		
		// 정수형 데이터 타입
		// 크기가 다를 수 있음
		byte b;    // 1byte 크기 (8bit) -> 가장 앞의 1bit는 부호 비트
		short s;  // 2byte 크기 (16bit)
		int i;        // 4byte 크기 (32bit)
		long l;     // 8byte 크기 (64bit)
		
		// byte
		b = 127;  // 정상
//		b = 128;  // 오류 (Type mismatch) -> byte는 127까지만 넣을 수 있음)
		b = -128;  // 정상
//		b = -129;  // 오류
		
		// 데이터 타입 byte의 범위 : -128 ~ 127
		
		// short
		s = 128;
		
		// int ***
		// 약 +- 21억까지의 정수를 담을 수 있는 데이터 타입
		i = 2100000000;  // 정수
//		i = 2200000000;  // 오류
		
		// long
//		l = 2200000000;  // 오류 (The literal 2200000000 of type int is out of range) 
		// L value = R value
		// 컴퓨터 정수 값의 기본 단위 : int 
		// -> 접미사를 통해 이 수를 int 타입이 아니라 long 타입으로 보라고 알려줘야 함
		
		// 접미사를 붙여주면 오류가 나지 않음
		l = 2200000000L;  // L의 대소문자 둘 다 가능 (대문자 권장)
		
		
	}  // end of main
	
}  // end of class
