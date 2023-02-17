package test0217;

// 코드 테스트
public class LottoMainTest {

	public static void main(String[] args) {
		
		int[] result = new int[6];
		
		// 설계한 클래스 인스턴스화
		Lotto lotto = new Lotto();
		// 메서드로 랜덤 숫자 6개 배열 받기
		result = lotto.randomNumber();
		
		// 결과 확인
		System.out.println("결과");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "\t");
		}
		
	} // end of main
	
}
