package ch09;

import java.util.Arrays;
import java.util.Random;

public class LottoRandomNumberSolution {

	final int LOTTO_NUMBER_SIZE = 6;
	
	// 6개 난수가 발생하는 배열 리턴
	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];
		// 여기서만 사용할거면 지역변수로 쓰기 (메모리 절약)
		Random random = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum); // 오름차순 정렬
		return lottoWinNum;
	}
	
}
