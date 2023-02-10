package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본 생성자는 사용자 정의 생성자가 있으면 만들어주지 않음
		
		// 1. 사용자 정의 생성자 (매개변수 3개 한 번에 사용)
		UserInfo userA = new UserInfo("o1", "이", "010-1234-****");
		System.out.println(userA.userId);
		System.out.println(userA.userName);
		System.out.println(userA.phone);
		System.out.println("=================");
		
		// 2. 사용자 정의 생성자 (userId, userName)
		UserInfo userB = new UserInfo("o2", "김");
		System.out.println(userB.userId);
		System.out.println(userB.userName);
		System.out.println(userB.phone);
		System.out.println("=================");
		
		// 3. 사용자 정의 생성자 (userId)
		UserInfo userC = new UserInfo("o3");
		System.out.println(userC.userId);
		System.out.println(userC.userName);
		System.out.println(userC.phone);
		System.out.println("=================");
		
		// 4. 기본 생성자
		UserInfo userD = new UserInfo();
		System.out.println(userD.userId);
		System.out.println(userD.userName);
		System.out.println(userD.phone);		
		System.out.println("=================");
		
	}

}
