package ex05;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	// 이름 전화번호
	HashMap<String, String> phoneBook = new HashMap<>();
	static Scanner scanner = new Scanner(System.in);
	
	public void sampleData() {
		phoneBook.put("김철수", "010-1234-1234");
		phoneBook.put("이영수", "010-5678-5678");
		phoneBook.put("박민수", "010-9876-9876");
	}
	
	// 저장 기능
	public void save() {
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
	public void showInfo(String input) {
		if (phoneBook.isEmpty()) {
			System.out.println("저장된 전화번호가 없습니다.");
			return;
		}
		
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
	public void deleteInfo(String input) {
		if (phoneBook.isEmpty()) {
			System.out.println("저장된 전화번호가 없습니다.");
			return;
		}
		
		// 선택 삭제
		if (input.equals("4")) {
			System.out.println("이름을 입력해주세요.");
			String selectName = scanner.nextLine();
			
			if (phoneBook.containsKey(selectName) == false) {
				System.out.println("존재하지 않는 이름입니다.");
				return;
			}
		
			// 삭제 여부 확인받기
			System.out.println("정말 삭제하겠습니까?\n계속 진행하려면 1, 아니면 0를 입력해주세요.");
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
			System.out.println("정말 모든 정보를 삭제하겠습니까?\n계속 진행하려면 1, 아니면 0를 입력해주세요.");
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
}
