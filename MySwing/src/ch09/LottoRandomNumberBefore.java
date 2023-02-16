package ch09;

import java.util.Arrays;
import java.util.Random;

// LRP : 단일 책임 원칙
// 하나의 클래스에게는 하나의 책임이 주어지는 것이 적절하다.

// 랜덤 번호 발생하는 클래스 (1~45)
// get, set 필요하면 생성
// 6개의 정렬된 번호 리턴
public class LottoRandomNumberBefore {

	private int[] lotto = new int[6];
	
	Random r = new Random();
	

	public int[] getLotto() {
		return lotto;
	}

	public int[] lottoNumber() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		} // end of for
		Arrays.sort(lotto);
		return lotto;
	}
	
}
