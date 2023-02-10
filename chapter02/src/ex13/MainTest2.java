package ex13;

public class MainTest2 {

	public static void main(String[] args) {
		// 2
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		// 오름차순으로 정렬 해주세요
		// for , if 문 활용

		int temp;

		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = (i + 1); j < myNumbers.length; j++) {
				if (myNumbers[i] > myNumbers[j]) {
					temp = myNumbers[i];
					myNumbers[i] = myNumbers[j];
					myNumbers[j] = temp;
				}
			}
		}

		// 결과 출력
		for (int a = 0; a < myNumbers.length; a++) {
			System.out.println("인덱스 " + a + "번. " + myNumbers[a]);
		}

	}

}
