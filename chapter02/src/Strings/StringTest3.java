package Strings;

public class StringTest3 {
	// 쓰레드 --> 메인 작업자
	public static void main(String[] args) {
		// StringBuilder    ///   StringBuffer ***통신 관련
		// 문자열을 여러 번 연결 or 변경할 때 유용함
		// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다.
		// 단일 쓰레드 프로그램에서는 StringBuilder를 권장한다.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java + android);
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder));
		System.out.println("-----------------------");
		System.out.println("builder 값 : " + builder);
		
		// StringBuilder 클래스의 append 메서드 : 문자열 더하기
		builder.append(android);
		System.out.println(builder);
		System.out.println("------------------------");
		System.out.println(System.identityHashCode(builder)); // 문자열이 달라졌는데도 주소 값이 같음
		// StringBuilder는 이미 만들어진 공간에 다시 접근해서 값을 변경함 (새롭게 메모리 공간 생성 X)
		
		// 응용 : StringBuilder 타입을 String으로 형 변환하기
		// 1번. StringBuilder 클래스의 toString 메서드
		String result = builder.toString();
		
		// 2번. 문자열 연산
		String result2 = builder + " : 반가워";
		
		// 결론 
		// StringBuilder는 문자열을 다룰 때 한 번 생성한 문자열을 변경하더라도 
		// 메모리를 새로 생성하지 않음

	}

}
