package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {
		
//		Book book1 = new Book("1", "1");
		// 연관된 데이터들을 통으로 관리하고 싶다면 배열
		Book[] books = new Book[10]; // 배열 선언 (메모리 공간 생성)
		// 객체 배열의 메모리 공간에는 heap 메모리에 대한 주소 값이 할당됨
		
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		books[9] = new Book("홍길동전", "허균");
		
//		books[5] = new Book("사피엔스", "유발하라리");
		// 런타임 에러 -> java.lang.ArrayIndexOutOfBoundsException
		// 인덱스 5는 길이를 벗어난 값
		
		System.out.println(books[0].getTitle()); // books[0]은 객체임
		System.out.println(books[4].getAuthor());
		
		// 배열은 보통 반복문 for와 자주 쓰인다.
		
		for (int i = 0; i < books.length; i++) {  // 배열명.length : 배열의 길이(int)
			// 런타임 에러를 방지하기 위한 방어적 코드
			if (books[i] != null) {
				System.out.println(books[i].getTitle());				
			}
		}

		// 주의 1
		// 배열의 길이 : n
		// 인덱스 범위 : 0 ~ n-1
		
		// 주의 2
		// 배열의 길이와 실제 들어가 있는 값의 개수는 다를 수 있음
		// 값이 부여되지 않은 인덱스의 값에 접근하려고 하면 NullPointerException 에러
	
		// 배열을 다룰 때는 런타임 에러가 잦으므로, 방어적 코드 작성을 계속 연습해보자.
		
		// 문제 1 : double 배열 크기 4로 선언해서, 임의 값을 넣고 for문으로 출력해주세요
		// 3번째 인덱스는 값을 할당하지 마시오 (방어적 코드 사용)
		double[] arrDouble = new double[4];
		
		arrDouble[0] = 0.1;
		arrDouble[1] = 0.2;
		arrDouble[2] = 0.3;
		
		for (int i = 0; i < arrDouble.length; i++) {
			if (arrDouble[i] != 0.0) { // double은 0.0이 기본값이라서 방어적 코드 불필요
				System.out.println(arrDouble[i]);
			}
		}
		
		// 문제 2 : 0번째 인덱스에 있는 값과 2번째 인덱스에 있는 값을 스왑해주세요
		
		Book temp = books[0];  // 0번째 인덱스 값을 임시로 저장
		books[0] = books[2];  // 0번에 2번 대입
		books[2] = temp;  // 임시로 저장해둔 것을 2번에 대입
		
		// 문제 3 : 인덱스 3번의 값을 삭제해주세요
		books[3] = null;

				
		
		
		
	}

}



