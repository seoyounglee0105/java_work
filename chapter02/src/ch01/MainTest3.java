package ch01;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 같은 패키지에 있을 때는 import하지 않아도 가져올 수 있음
		Student studentKim = new Student();
		
		System.out.println(studentKim);  // 주솟값이 출력됨 : 패키지명.클래스명@객체주솟값
		
		Student studentLee = new Student();
		System.out.println(studentLee);  // 주솟값이 출력됨 : 패키지명.클래스명@객체주솟값
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		
		// 기본 데이터 타입 : 값(리터럴)이 출력됨
		// 참조 타입 : 주솟값이 출력됨
		
		System.out.println("-------------------");
		System.out.println(studentLee.studentId);
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.address);
		System.out.println(studentLee.height);
		System.out.println(studentLee.isMarred);
		
		// 멤버 변수는 메모리에 올라간 뒤 멤버 변수에 값을 할당하지 않으면
		// 기본값으로 먼저 컴파일러가 자동으로 초기화해줌 (int : 0, double : 0.0, String : null, boolean : false) 
		
		
	}

}
