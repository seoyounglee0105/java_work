package ch09;

import java.util.Arrays;
import java.util.Random;

// LRP : 단일 책임 원칙
// 하나의 클래스에게는 하나의 책임이 주어지는 것이 적절하다.

// 랜덤 번호 발생하는 클래스 (1~45)
// get, set 필요하면 생성
// 6개의 정렬된 번호 리턴
public class LottoRandomNumber {

	public int[] lottoNumber() {
		// 메서드에서 리턴할 것이므로 멤버변수로 선언하지 않아도 됨
		int[] lotto = new int[6];
		
		// 한 곳에서만 사용된다면 지역변수로 선언
		Random r = new Random();  
		
		for (int i = 0; i < lotto.length; i++) {
			// 1 ~ 45 범위의 정수 난수를 생성해서 배열에 넣기
			lotto[i] = r.nextInt(45) + 1;
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // 이번 반복을 취소하고 다시 하도록 함
				}
			}
		} // end of for
	
		// 오름차순 정렬
		Arrays.sort(lotto);
		return lotto;
	}
	
}
