package ch02;

public class UserInfo {
	
	String userId;
	String userName;
	String phone;
	
	// 1. 사용자 정의 생성자 (매개변수 3개 한 번에 사용)
	public UserInfo(String userId, String userName, String phone) {
		// 멤버 변수 = 매개변수(지역변수)
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
	}
	
	// 2. 사용자 정의 생성자 (userId, userName)
	public UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
		// 외부에서 매개변수로 주입받지 않고 값으로 바로 초기화도 가능함
		this.phone = "010-1234-5678";
	}
	
	// 3. 사용자 정의 생성자 (userId)
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 4. 기본 생성자
	public UserInfo() {}
	
}

