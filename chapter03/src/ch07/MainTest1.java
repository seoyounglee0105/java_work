package ch07;

import java.lang.*;

public class MainTest1 {

	public static void main(String[] args) {
		// java.lang.*;  <-- 컴파일러가 자동으로 import 해줌 (직접 작성하지 않아도 됨)

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "홍길동전", "허균");
		Book book3 = new Book(3, "홍길동전", "허균");

		String str = new String("반가워");
		System.out.println(str); // 리터럴 값이 출력됨
		System.out.println(book1); // 주소 값이 출력됨
		// 두 결과가 다르게 나타나는 이유는?
		// toString() 메서드 : 최상위 클래스 Object의 메서드이다.
		// 모든 클래스는 Object를 상속받으므로, toString() 메서드를 오버라이드할 수 있다.
		// -> toString()은 필요 시 재정의해서 사용할 수 있다.
		// -> String 클래스 안에 toString()가 재정의되어 있다.
		
		if (book2 == book3) {
			System.out.println("주소 값이 같아요");
		} else {
			System.out.println("주소 값이 달라요");
		}
		
		// equals 메서드 재정의 하기 전
		if (book2.equals(book3)) {
			System.out.println("주소 값이 같아요");
		} else {
			System.out.println("주소 값이 달라요");	
		}
		
		
		
		
	}	
	
}
