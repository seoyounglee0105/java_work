package ex04;

// Data Transfer Object

public class UserDTO {

	// 테이블 구조 확인하고 멤버변수 선언하기
	String userName;
	String birthYear;
	String addr;
	String mobile;
	
	// 생성자 만들기
	public UserDTO(String userName, String birthYear, String addr, String mobile) {
		this.userName = userName;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}

	// get 메서드 만들기
	public String getUserName() {
		return userName;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public String getAddr() {
		return addr;
	}

	public String getMobile() {
		return mobile;
	}
	
	
	
}
