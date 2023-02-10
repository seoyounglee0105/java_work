package starcraft;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4; 
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");

		Scanner scanner = new Scanner(System.in);
		int unitChoice = -1; // 초깃값
		do {
			// 입력 받은 정수 값에 따라 진행
			System.out.println("유닛을 선택하세요");
			System.out.println("1. 질럿\t2. 마린\t3. 저글링\t4. 종료"); // 이스케이프 문자  -> \t : [TAP]키 // \n : [Enter]키 (줄 바꿈)			
			// 사용자에게 입력 값 받기
			unitChoice = scanner.nextInt();
			if (unitChoice == ZEALOT) { // 가독성을 위해 리터럴 대신 상수로 대체함
				// 질럿 선택
				
			} else if (unitChoice == MARINE) {
				// 마린 선택
				
			} else if (unitChoice == ZERGLING) {
				// 저글링 선택
				
			}
		} while (unitChoice != GAME_END);
		System.out.println("게임이 종료 되었습니다.");
		
		
	}

}
