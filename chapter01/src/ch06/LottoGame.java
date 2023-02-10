package ch06;

// Random 클래스 가져오기
import java.util.Random;

public class LottoGame {

	// 함수를 만들 때 반드시 어떠한 기능을 만들지 정의하고 코드를 작성하라
	// 랜덤 숫자 하나를 반환하는 기능을 만들어 보자
	static int randomNumber() {
		// 알고리즘 설계
		// JDK가 만들어 준 도구 이용해보기
		Random random = new Random();
		// 랜덤 값을 하나 생성해서 반환
		// random.nextInt(n) : 0부터 (n-1)까지 중에 랜덤 값 반환
		int resultNumber = random.nextInt(45) + 1; // 1부터 45까지 중에 랜덤 값 반환
		return resultNumber;
	}
	
	// 코드 실행 메인 함수
	public static void main(String[] args) {
		int r1 = randomNumber();
		int r2 = randomNumber();
		int r3 = randomNumber();
		int r4 = randomNumber();
		int r5 = randomNumber();
		int r6 = randomNumber();
		
		System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5 + " : " + r6);
		
		
	} // end of main

}
