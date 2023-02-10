package Strings;

public class StringTest2 {
	public static void main(String[] args) {
		// 상수 풀 영역을 이해했다면, 실제 주소 값을 찍어 보자.
		
		// 최상위 클래스 Object
		
		String str1 = "반가워"; // 간소화한 형태 (1번 반식)
		String str2 = new String("반가워"); // 원형 (2번 방식) -> 참조 데이터 타입이라서
		String str3 = new String("반가워");
		String str4 = "반가워";
		
		// final을 클래스 앞에 쓰면 상속 불가능한 클래스가 됨
		
		// 현재 String 주소 값을 찍어 보는 방법
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		// 상수 풀에 한 번 생성된 문자열은 불변(immutable)이다.
		str4 = str4 + " 홍길동";
		System.out.println(System.identityHashCode(str4)); // 기존 str4의 주소 값과 달라짐
		str1 += " : 하이";
		System.out.println(System.identityHashCode(str1)); // 기존 str1의 주소 값과 달라짐
		// 상수 풀 영역에 한 번 생성된 문자열 값은 변경이 불가능하다.
		// 문자열이 변경되면 상수 풀 영역에 새로운 메모리로 생성됨
		
		// 가, 나, a, ............... <- 계속 상수 풀 영역에서 메모리를 사용함
		
		// 채팅 프로그램처럼 글자를 빈번하게 써야 한다면 or 메모리를 효율적으로 사용해야 한다면
		// StringBuilder 클래스와 StringBuffer 클래스를 알아야 함
		// => 다음 파일
		
		
	} // end of main
} // end of class
