package test0217;

// 클래스 설계
import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// 배열 선언
	int[] lottoArr = new int[6];
	
	public int[] randomNumber() {
		Random random = new Random();
		
		// 난수 생성
		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = random.nextInt(45) + 1;
			
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (lottoArr[i] == lottoArr[j]) {
					i--;
				}
			}
		} // end of for
		
		// 오름차순 정렬
		Arrays.sort(lottoArr);
		return lottoArr;
	} // end of method
	
} // end of class
