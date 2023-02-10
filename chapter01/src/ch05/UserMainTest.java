package ch05;

// 클래스를 사용하는 쪽 코드 작성
public class UserMainTest {

	public static void main(String[] args) {

		// 메모리에 올리고 값을 할당하고 화면에 값을 출력하세요
		User user1;
		user1 = new User();

		user1.name = "이서영";
		user1.age = 24;
		user1.job = "대학생";
		user1.address = "부산광역시 수영구";
		user1.email = "os010312@naver.com";

		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.job);
		System.out.println(user1.address);
		System.out.println(user1.email);
	}

}
