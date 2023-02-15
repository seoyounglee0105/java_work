package ch08;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// 배열 선언과 동시에 초기화하기
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}			
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("개발자야, 인덱스 길이 모르니?");
		}
//		System.out.println("비정상 종료되지 않았습니다.");
		
	} // end of main
} // end of class
