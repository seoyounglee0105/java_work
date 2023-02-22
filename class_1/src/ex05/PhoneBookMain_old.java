package ex05;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain_old {
	static Scanner scanner = new Scanner(System.in);

	// 이름 전화번호
	HashMap<String, String> phoneBook = new HashMap<>();

	// while문 사용 : 0. 종료 1. 저장 2. 전체조회 3. 선택조회 4. 선택삭제 5. 전체삭제 구현
	public static void main(String[] args) {

		String userInput = "-1"; // 입력받을 기능 선택 번호
		Boolean flag = true; // 프로그램 종료 여부
		PhoneBookMain_old bookMain = new PhoneBookMain_old(); // 메서드를 사용하기 위해 인스턴스화

		// 샘플 데이터
		bookMain.phoneBook.put("김철수", "010-1234-1234");
		bookMain.phoneBook.put("이영수", "010-5678-5678");
		bookMain.phoneBook.put("박민수", "010-9876-9876");

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
				bookMain.save();

				// ***** 2번. 전체조회
			} else if (userInput.equals("2")) {
				System.out.println("2번, 전체 조회를 선택하셨습니다.\n");
				bookMain.showInfo(userInput);

				// ***** 3번. 선택조회
			} else if (userInput.equals("3")) {
				System.out.println("3번, 선택 조회를 선택하셨습니다.\n");
				bookMain.showInfo(userInput);

				// ***** 4번. 선택삭제
			} else if (userInput.equals("4")) {
				System.out.println("4번, 선택 삭제를 선택하셨습니다.\n");
				bookMain.deleteInfo(userInput);

				// ***** 5번. 전체삭제
			} else if (userInput.equals("5")) {
				System.out.println("5번, 전체 삭제를 선택하셨습니다.\n");
				bookMain.deleteInfo(userInput);

			}
			System.out.println("\n=======================");
		}

	} // end of main

	// 메서드로 정의하기

	// 저장 기능
	private void save() {
		String phoneName = null; // 입력받을 이름
		String phoneNumber = null; // 입력받을 전화번호

		System.out.println("이름을 입력해주세요.");
		phoneName = scanner.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		phoneNumber = scanner.nextLine();

		// 값을 올바르게 입력했는지 확인받기
		System.out.println("이름 : " + phoneName + ", 전화번호 : " + phoneNumber + "을 입력하셨습니다.\n맞으면 1, 틀리면 0을 입력해주세요.");
		String yesNo = scanner.nextLine();
		if (yesNo.equals("1")) {
			phoneBook.put(phoneName, phoneNumber);
			System.out.println("저장이 완료되었습니다.");
		} else if (yesNo.equals("0")) {
			System.out.println("저장을 취소합니다.");
			// 다른 값을 입력한 경우
		} else {
			System.out.println("값을 잘못 입력하셨습니다.");
		}
	} // end of save method

	// 조회 기능
	private void showInfo(String input) {
		// 전체 조회
		if (input.equals("2")) {
			for (String key : phoneBook.keySet()) {
				System.out.println("----------");
				System.out.println("이름 : " + key);
				System.out.println("전화번호 : " + phoneBook.get(key));
			}
			// 선택 조회
		} else if (input.equals("3")) {
			System.out.println("이름을 입력해주세요.");
			String selectName = scanner.nextLine();
			if (phoneBook.containsKey(selectName)) {
				System.out.println(selectName + "의 전화번호는 " + phoneBook.get(selectName) + "입니다.");				
			} else {
				System.out.println("존재하지 않는 이름입니다.");
			}
		}
	} // end of showInfo method

	// 삭제 기능
	private void deleteInfo(String input) {
		// 선택 삭제
		if (input.equals("4")) {
			System.out.println("이름을 입력해주세요.");
			String selectName = scanner.nextLine();
			
			if (phoneBook.containsKey(selectName) == false) {
				System.out.println("존재하지 않는 이름입니다.");
				return;
			}
		
			// 삭제 여부 확인받기
			System.out.println("정말 삭제하겠습니까?\n계속 진행하시겠다면 1, 아니면 0를 입력해주세요.");
			String yesNo = scanner.nextLine();
			if (yesNo.equals("1")) {
				System.out.println("삭제가 완료되었습니다.");
				phoneBook.remove(selectName);
			} else if (yesNo.equals("0")) {
				System.out.println("삭제를 취소합니다.");
				// 다른 값을 입력한 경우
			} else {
				System.out.println("값을 잘못 입력하셨습니다.");
			}
			// 전체 삭제
		} else if (input.equals("5")) {
			// 삭제 여부 확인받기
			System.out.println("정말 모든 정보를 삭제하겠습니까?\n계속 진행하시겠다면 1, 아니면 0를 입력해주세요.");
			String yesNo = scanner.nextLine();
			if (yesNo.equals("1")) {
				System.out.println("삭제가 완료되었습니다.");
				phoneBook.clear();
			} else if (yesNo.equals("0")) {
				System.out.println("삭제를 취소합니다.");
				// 다른 값을 입력한 경우
			} else {
				System.out.println("값을 잘못 입력하셨습니다.");
			}
		}
	} // end of deleteInfo method

} // end of class
