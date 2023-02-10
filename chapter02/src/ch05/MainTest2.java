package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 객체 생성
		Student studentLee = new Student("이서영", 20000);
		Bus bus62 = new Bus(62);
		Bus bus83 = new Bus(83);
		Bus bus108 = new Bus(108);

		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);

		// 1단계 - 사용해보기
		// 버스를 탄다
//		studentLee.takeBus(bus62);
//		
//		studentLee.showInfo();
//		bus62.showInfo();
//		
//		// 지하철을 탄다
//		studentLee.takeSubway(subway1);
//		
//		studentLee.showInfo();
//		subway1.showInfo();

		// 2단계 - 직접 실행 흐름 만들어 보기
		// Scanner로 받아서 지하철/버스 몇 번을 탈 건지 등
		Scanner sc = new Scanner(System.in);

		// 학원 오는 루트
		// 1 : 버스 83번 or 108번 -> 지하철 2호선 (더 빠르고 비쌈)
		// 2 : 버스 62번 (더 느리고 저렴함)
		
		System.out.println("더 빠른 루트로 가겠습니까? (true or false)");
		boolean	yesNo = sc.nextBoolean();

		if (yesNo == true) {  // 더 빠르고 비싼 루트 선택
			System.out.println("몇 번 버스를 타겠습니까? (83 or 108)");
			int busNum = sc.nextInt();
			sc.nextLine();
			
			// 버스 번호를 잘못 입력한 경우
			while ((busNum != 83) && (busNum != 108)) {
				System.out.println("다른 번호를 입력해주세요. (83 or 108)");
				busNum = sc.nextInt();
				sc.nextLine();
			}
			
			if (busNum == 83) {
				System.out.println("83번 버스에 탑승합니다.");
				studentLee.takeBus(bus83);
			} else if (busNum == 108) {
				System.out.println("108번 버스에 탑승합니다.");
				studentLee.takeBus(bus108);
			}

			System.out.println("지하철 2호선에 탑승합니다");
			studentLee.takeSubway(subway2);
			
		} else if (yesNo == false) {  // 더 느리고 저렴한 루트 선택
			System.out.println("62번 버스에 탑승합니다");
			studentLee.takeBus(bus62);
		}
		studentLee.showInfo();

	}

}
