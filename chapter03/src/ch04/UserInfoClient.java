package ch04;

//import java.util.Scanner;

public class UserInfoClient {

	// main : 실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {
		
		// 사용자한테 정보를 입력 받음
		// String userName, String pw
		// 스캐너 활용 : 이름 한 글자 이상, PW 특수문자 포함
//		Scanner scanner = new Scanner(System.in);
		
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		
		// 받은 데이터를 Object 타입으로 변화  :: DTO
		
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		userInfo.showInfo();
		
		
		// 위는 클라이언트 쪽 코드들 (개발자가 작성)
		////////////////////////////////////
		// 동작이 사용자의 정보를 입력하는 기능이 필요하다면
		UserInfoMysqlDao dao = new UserInfoMysqlDao();
		dao.insertUserInfo(userInfo); // 저장하는 기능
		
		
	}
	
}
