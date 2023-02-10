package ch05;

import java.util.Scanner;

// 클래스를 사용하는 쪽 코드 작성
public class UserMainTest2 {

	public static void main(String[] args) {

		User user2 = new User();
		
		// 멤버 변수의 값을 Scanner를 이용해서 입력 받고 값을 출력하세요.
		// Scanner : 키보드로 입력한 값을 받아주는 객체 (입력 장치)
		// sc.nextLine() : 문자열을 입력받는 명령어
		Scanner sc = new Scanner(System.in);
		
		// 주의 사항
		// nextInt()에는 개행문자(Enter키, \n)이 포함되어 있음.
		// nextInt() 다음에 nextLine()이 나오게 되면 그 개행문자가 nextLine()에 입력되면서
		// 개발자의 의도와 다르게 동작함. (nextLine()에 받고자 했던 입력 창이 나타나지 않음.)
		// 해결 방안
		// nextInt()의 개행문자를 제거해줘야 함.
		// -> nextInt() 다음 행에 nextLine()을 실행해서 개행문자가 이쪽에 입력되게 함.
		
		System.out.println("이름은?");
		user2.name = sc.nextLine();
		System.out.println("나이는?");
		user2.age = sc.nextInt(); 
		sc.nextLine();  // 개행문자 제거 용도
		System.out.println("직업은?");
		user2.job = sc.nextLine();
		System.out.println("사는 지역은?");
		user2.address = sc.nextLine();
		System.out.println("이메일 주소는?");
		user2.email = sc.nextLine();

		System.out.println("=====상태창=====");
		System.out.println("name : " + user2.name);
		System.out.println("age : " + user2.age);
		System.out.println("job : " + user2.job);
		System.out.println("address : " + user2.address);
		System.out.println("email : " + user2.email);
		System.out.println("===============");
		
	}

}
