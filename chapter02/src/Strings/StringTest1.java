package Strings;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = "반가워"; // 간소화한 형태 (1번 반식)
		String str2 = new String("반가워"); // 원형 (2번 방식) -> 참조 데이터 타입이라서
		String str3 = new String("반가워");
		String str4 = "반가워";
		
		// 값 출력
		System.out.println("str1 " + str1);
		System.out.println("str2 " + str2);
		
		// 1번 방식과 2번 방식은 메모리 위치 시키는 곳이 다르다
		// 1번 - > 상수 풀 영역에 저장됨
		// 2번 -> heap 메모리 영역에 저장됨
		
		//  == 연산자 : 기본 데이터 타입인 경우 -> 값을 비교 /// 클래스 타입인 경우 -> 주소 값을 비교
		
		// 검증하기
		if (str1 == str2) {
			System.out.println("주소값이 같아요~");
		} else {
			System.out.println("주소값이 달라요~");  // 1번 방식과 2번 방식의 주소 값이 다르다.
		}
		System.out.println("=================");
		// 검증하기
		if (str2 == str3) {
			System.out.println("주소값이 같아요~");
		} else {
			System.out.println("주소값이 달라요~");  // 각 객체마다 주소 값이 다르다.
		}
		// 검증하기
		if (str1 == str4) {
			System.out.println("주소값이 같아요~"); // 상수 풀 영역에서는 똑같은 문자열이면 주소 값이 같다. ***
			                                                                      //  => 한 번 생성된 문자열을 재활용할 수 있도록 함
		} else {
			System.out.println("주소값이 달라요~");
		}
		
		// 결론
		// 리터럴 값으로 생성한 문자열은 상수 풀 영역에 올라가고,
		// 동일한 문자열을 생성한다면 메모리 공간을 새로 생성하지 않고 기존의 문자열을 재활용함 
		// -> 주소 값이 같음
		
		System.out.println("=================");
		// 검증하기
		if (str1.equals(str1)) {  // equals는 문자열 모양을 비교함
			System.out.println("문자열 모양이 같아요~");
		} else {
			System.out.println("문자열 모양이 달라요~");  
		}
		
		
		
		
		
	}
	
}
