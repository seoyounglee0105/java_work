package ch09;

import java.util.Scanner;

/*
 * @author 이서영
 */

public class BookStoreManager {

	public static void main(String[] args) {

		// 문자열 비교 연산자 (완전히 같아야 true) : 문자열1.equals(문자열2)
//		String temp = "안녕";
//		if (temp.equals("안")){
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요");
//		}

		// CRUD 개념 조사하기
		// Create : 생성
		// Read : 읽기
		// Update : 갱신
		// Delete : 삭제

		// 책을 저장하는 기능을 만들고 정보를 출력하는 프로그램 만들기
		// while문을 사용해서
		// 1. 저장 2. 전체 조회 3. 선택조회 4. 전체삭제 0. 프로그램 종료

		// 도구 준비
		Scanner scanner = new Scanner(System.in);

		// 책 배열
		Book[] books = new Book[100];

		// 메뉴 선택 변수
		String choice = null;

		// 임시로 책 제목과 작가명을 입력 받을 변수
		String tempTitle;
		String tempAuthor;

		// 상수 선언
		final String SAVE = "1";
		final String ALL_SHOW = "2";  // SEARCH_ALL
		final String SELECT_SHOW = "3";  // SEARCH_BY_TITLE
		final String ALL_DELETE = "4";  // DELETE_ALL
		final String BREAK = "0";  // END

		// 프로그램 종료 여부를 판단할 변수 (true : 진행, false : 종료)
		boolean flag = true;

		// 선택 조회에서 사용할 임시 변수
		boolean temp = false;

		while (flag) {
			
			System.out.println("원하시는 기능이 무엇인가요?");
			System.out.println("1. 저장\t2. 전체조회\t3. 선택조회\t4. 전체삭제\t0.프로그램 종료");
			choice = scanner.nextLine();

			// 0. 프로그램 종료 //
			if (choice.equals(BREAK)) {
				flag = false;
				System.out.println("프로그램 종료\n");

				// 1. 저장 //
			} else if (choice.equals(SAVE)) {
				System.out.println("1번, 책 저장을 선택하셨습니다.");
				System.out.println("책 제목을 입력해주세요.");
				tempTitle = scanner.nextLine(); // 임시 책 제목 저장
				System.out.println("작가명을 입력해주세요.");
				tempAuthor = scanner.nextLine(); // 임시 작가명 저장

				for (int i = 0; i < books.length; i++) {
					// 기능 : 가장 처음 나오는 null 배열 공간을 찾아서,
					// 그 공간에 tempTitle, tempAuthor 할당
					if (books[i] == null) {
						books[i] = new Book(tempTitle, tempAuthor);
						tempTitle = null; // 사용한 값은 null로 초기화
						tempAuthor = null; // 사용한 값은 null로 초기화
						break; // for 빠져 나오기
					}
				}
				System.out.println();
				// 2. 전체 조회 //
			} else if (choice.equals(ALL_SHOW)) {
				System.out.println("2번, 전체 조회를 선택하셨습니다.");
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						System.out.println(
								(i + 1) + ". 책 제목 : " + books[i].getTitle() 
								+ ", 저자 : " + books[i].getAuthor()
						);
					}
				}
				System.out.println();
				// 3. 선택 조회 //
			} else if (choice.equals(SELECT_SHOW)) {
				System.out.println("3번, 선택 조회를 선택하셨습니다.");
				System.out.println("조회할 책 제목을 입력해주세요.");
				tempTitle = scanner.nextLine();
				for (int i = 0; i < books.length; i++) {
					// 방어적 코드
					if (books[i] != null) {
						if (books[i].getTitle().equals(tempTitle)) {
							System.out.println("책 제목 : " + books[i].getTitle() + ", 저자 : " + books[i].getAuthor());
							temp = true; // 검색한 책이 존재함을 의미함
							break;
						}
					}
				} // end of for

				// 기능 : 입력한 제목에 해당하는 책이 존재하지 않는다고 알림 띄우기
				if (temp == false) {
					System.out.println("책이 존재하지 않습니다.");
				}
				temp = false; // 임시 변수는 다시 false로 초기화
				System.out.println();
				// 4. 전체 삭제 //
			} else if (choice.equals(ALL_DELETE)) {
				System.out.println("4번, 전체 삭제를 선택하셨습니다.");
				for (int i = 0; i < books.length; i++) {
					books[i] = null; // 참조 자료형의 기본값은 null
				} // end of for
				System.out.println("삭제가 완료되었습니다.\n");

				// 번호를 잘못 입력한 경우 //
			} else {
				System.out.println("번호를 잘못 입력하셨습니다.\n");
			}
			System.out.println("========================");

		} // end of while

	} // end of main
} // end of class
