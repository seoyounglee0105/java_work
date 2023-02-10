package ex13;

import java.util.Random;
//import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		// 우리반 학생 이름들을 배열에 담아주세요
		// 랜덤 클래스로 한 명 추출해주세요

		// 상수 선언
		final int NUMBER = 18;

		// 배열 선언
		String[] arrayName = new String[NUMBER];

		// 도구 준비
		// Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean flag = true;

		arrayName[0] = "편용림";
		arrayName[1] = "김효린";
		arrayName[2] = "배진석";
		arrayName[3] = "강민정";
		arrayName[4] = "한범진";
		arrayName[5] = "손주이";
		arrayName[6] = "김유주";
		arrayName[7] = "김미정";
		arrayName[8] = "김지현";
		arrayName[9] = "박성희";
		arrayName[10] = "이지운";
		arrayName[11] = "정다운";
		arrayName[12] = "이치승";
		arrayName[13] = "이서영";
		arrayName[14] = "전대영";
		arrayName[15] = "김현우";
		arrayName[16] = "김민우";
		arrayName[17] = "이현서";

		// 이름을 직접 입력할 경우
		// for (int i = 0; i < NUMBER; i++) {
		// System.out.println("이름을 입력해주세요.");
		// arrayName[i] = scanner.nextLine();
		// }

		while (flag) {
			System.out.println("랜덤으로 한 명을 고릅니다.");
			int indexRandom = random.nextInt(NUMBER);
			System.out.println(arrayName[indexRandom]);
			flag = false;
		}

	}
}
