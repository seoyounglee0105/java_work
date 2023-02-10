package ex0209;

import java.util.Random;
import java.util.Scanner;

public class GachaMachine {
	// 뽑기 머신 안에 포함되어 있는 여러 경품들 (장난감, 현금)
	// 현금이 나오면 '축하합니다' 메시지 나오도록 설계
	// 돈을 받다, 경품을 주다, 수익금, 색상

	// 상품 재정의 - 상속 해서 클래스 설계

	// 랜덤 난수 : 1~3
	// 사용자 값 : 1~3
	// 스캐너로 입력받은 값 = 랜덤 난수 값이 같으면 상품을 추출해주세요

	// 상품 데이터 메모리에 올리기
	// 배열 사용하기

	public static void main(String[] args) {

		// 도구 준비
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean flag = true;

		// 상수 선언
		final int START_NUM = 1; // 값 범위 시작
		final int END_NUM = 3; // 값 범위 끝
		final int NUM_COUNT = 3; // 번호를 입력받을 개수

		// 사용자 값 배열 선언
		int[] arrayInput = new int[3];

		// 난수 배열 선언
		int[] arrayRandom = new int[3];

		// 유효 값 확인을 위한 임시 변수
		boolean temp = true;

		// 사용자 값과 난수 값의 일치 개수를 세는 변수
		int count = 0;

		// 객체 생성
		Candy candy1 = new Candy("츄파춥스", 300);
		Doll doll1 = new Doll("피카츄 인형", 10000);
		Money money1 = new Money("현금", 100000);

		while (flag) {

			//// 사용자 값 입력 받기 & 랜덤 난수 값 생성하기
			System.out.println("1~3 사이의 정수 3개를 입력해주세요.");
			for (int i = 0; i < NUM_COUNT; i++) {
				// 사용자 값을 입력받아 배열에 넣기
				arrayInput[i] = scanner.nextInt();
				// 사용자 입력 값이 범위에서 벗어났으면 false
				if (arrayInput[i] < START_NUM || arrayInput[i] > END_NUM) {
					temp = false; // 1~3이 아닌 값을 입력했다면 false가 됨
				}
			} // end of for

			//// for 문이 끝나고 나서 입력 값이 유효한지 확인
			if (temp == false) {
				System.out.println("값을 잘못 입력하셨습니다. 다시 선택해주세요.\n");
				System.out.println("======================");
				temp = true; // 다시 true로 초기화
				continue; // 밑의 코드를 무시하고 다음 반복으로 넘어감
			}

			//// 사용자 입력 값과 난수가 일치하는 개수 구하기 (순서도 같아야 함)
			for (int a = 0; a < NUM_COUNT; a++) {
				// 난수 생성
				arrayRandom[a] = random.nextInt(END_NUM) + START_NUM;
				System.out.println((a + 1) + "번째 번호 : " + arrayRandom[a]);

				if (arrayInput[a] == arrayRandom[a]) {
					count++;
				} // end of if
			} // end of for

			//// 결과 출력
			System.out.println("총 " + count + "개 일치했습니다.");

			if (count == NUM_COUNT) {
				System.out.println("축하합니다! ");
				System.out.println(money1.name + " " + money1.price + "원을 드립니다.");

			} else if (count == (NUM_COUNT - 1)) {
				System.out.println(doll1.name + "을 드립니다.");

			} else {
				System.out.println("아쉽네요.");
				System.out.println("참가상으로 " + candy1.name + "를 드립니다.");
			}

			// 초기화
			count = 0;
			System.out.println("\n======================");

		} // end of while

	} // end of main

} // end of class
