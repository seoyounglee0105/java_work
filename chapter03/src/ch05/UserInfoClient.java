package ch05;

//import java.util.Scanner;
public class UserInfoClient {
	
	static String dbName = "MSSQL";

	// main : 실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {
		
		// 사용자한테 정보를 입력 받음
		// String userName, String pw
		
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		
		// 받은 데이터를 Object 타입으로 변화  :: DTO
		
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);

		
		IUserInfoDao dao;
		if (UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		} else {
			dao = new UserInfoMssqlDao();
		}
		

		
	}
	
}
