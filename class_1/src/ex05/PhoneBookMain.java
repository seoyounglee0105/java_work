package ex05;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain {

	// while문 사용 : 0. 종료 1. 저장 2. 전체조회 3. 선택조회 4. 선택삭제 5. 전체삭제 구현
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userInput = "-1"; // 입력받을 기능 선택 번호
		Boolean flag = true; // 프로그램 종료 여부
		PhoneBook phoneBook = new PhoneBook();
		
		// 샘플 생성
		phoneBook.sampleData();
		
		while (flag) {
			System.out.println(">> 기능을 선택해주세요 <<");
			System.out.println("0. 종료\t1. 저장\t2. 전체조회\t3. 선택조회\t4. 선택삭제\t5. 전체삭제");
			userInput = scanner.nextLine();

			// ***** 0번. 프로그램 종료
			if (userInput.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;

			// ***** 1번. 저장
			} else if (userInput.equals("1")) {
				System.out.println("1번, 저장을 선택하셨습니다.\n");
				phoneBook.save();

			// ***** 2번. 전체조회
			} else if (userInput.equals("2")) {
				System.out.println("2번, 전체 조회를 선택하셨습니다.\n");
				phoneBook.showInfo(userInput);

			// ***** 3번. 선택조회
			} else if (userInput.equals("3")) {
				System.out.println("3번, 선택 조회를 선택하셨습니다.\n");
				phoneBook.showInfo(userInput);

			// ***** 4번. 선택삭제
			} else if (userInput.equals("4")) {
				System.out.println("4번, 선택 삭제를 선택하셨습니다.\n");
				phoneBook.deleteInfo(userInput);

			// ***** 5번. 전체삭제
			} else if (userInput.equals("5")) {
				System.out.println("5번, 전체 삭제를 선택하셨습니다.\n");
				phoneBook.deleteInfo(userInput);

			} else {
				System.out.println("잘못된 메뉴 선택입니다.");
			}
			System.out.println("\n=======================");
		}

	} // end of main

} // end of class
