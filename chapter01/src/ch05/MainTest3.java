package ch05;

public class MainTest3 {
	
	int number1 = 10; // 멤버 변수, 기본 데이터 타입
	User user = new User(); // 멤버 변수, 참조 데이터 타입 (대문자로 시작함)

	// 메인 함수 : 코드의 시작점
	public static void main(String[] args) {
		
		/* 참조 데이터 타입의 특징
		* 대문자로 시작함
		* 메모리 크기를 직관적으로 알 수 없음 (기본 데이터 타입과의 차이점)
		*/
		
		// 간단한 설명 (나중에 다시~)
		// 동적 메모리 공간 heap : 크기가 늘었다가 줄었다가 동적으로 변함
		// heap의 주솟값을 알아야 그 안에 있는 데이터에 접근할 수 있음
		
		// 멤버 변수와 지역 변수에 이름을 동일하게 설정할 수 있음
		// 변수 선언, 기본 데이터 타입, 지역 변수 
		int number1;
		User userKim;  // 변수 선언, 참조 데이터 타입, 지역 변수, 아직 메모리 공간에 존재하지 않는 상태
		                                                                                          // 메모리 공간에 올리려면 'new' 키워드를 사용해야 함

//		System.out.println(user);  // 오류 : main 함수 밖의 class 범위에 존재하는 user 변수는 main 함수에서 참조할 수 없음

	}

}
