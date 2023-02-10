package ch02;

public class TypeConversion {

	// 코드의 시작점 : main
	public static void main(String[] args) {
	/* 여러 줄 주석
	 * 형 변환 : 1. 자동 형 변환 2. 강제 형 변환
	 */
	int iNumber1 = 100; // 변수 선언
	System.out.println(iNumber1);
	
	// 자동 형 변환
	double dNumber1 = iNumber1;
	System.out.println(dNumber1);  // 형이 변환되었기 때문에, 자료형에 맞는 형태(실수)로 출력됨

	// 문제 만들어보기
	

	// 쌍따옴표 : 문자열,  홑따옴표 : 문자 1개
	System.out.println("======================================");
	
	// 강제 형 변환
	double dNumber2 = 0.0012345;
	System.out.println(dNumber2);  // 로깅 기법 (로그 찍어보기)
//	int iNumber2 = dNumber2;  // 오류 (Type mismatch) -> 정수형 자료형에 실수형 자료형을 넣으려면 다른 조치 필요
	
	int iNumber2 = (int)dNumber2;  // 개발자가 컴파일러에게 의도를 명시함 (실수형을 정수형으로 바꾸겠다)
	System.out.println(iNumber2);  // 0이 됨
	
//	int iNumber3 = 10.55;  // 오류(Type mismatch)
	int iNumber3 = (int)10.95;
	System.out.println(iNumber3);  // 10이 됨
	
	// ==> 주의 사항 : 강제 형 변환 시, 소숫점 단위는 그냥 버림 (반올림 X)
    //	                           -> 강제 형 변환 시, 데이터 손실이 생길 수 있음
	
	double a;
	int b;
	
	// 1. a에 값 0.5를 담아 보세요
	a = 0.5;
	
	// 2. b에 값 10.5를 담아 보세요
	b = (int)10.5;
	
	} // end of main

} // end of class
