package ch05;

import java.util.Scanner;

public class UserInfoClient2 {

	static String dbName = "Oracle";
	
	public static void main(String[] args) {
		
		// UserInfoOracleDao 만들어주세요
		// 스캐너를 통해 사용자 이름, 비번 입력받기
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 이름을 입력해주세요.");
		String inputUserName = scanner.nextLine();
		System.out.println("사용자 비밀번호를 입력해주세요.");
		String inputUserPw = scanner.nextLine();
		
		// 흐름 만들기
		// 1. 저장 기능, 2. 수정 기능
		// dbName을 변경해가며 코드 동작 확인
		
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		IUserInfoDao dao;
		if (UserInfoClient2.dbName.equals("Oracle")) {
			dao = new UserInfoOracleDao();
			dao.insertUserInfo(userInfo);
			dao.updateUserInfo(userInfo);
			
		} else if (UserInfoClient2.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
			dao.insertUserInfo(userInfo);
			dao.updateUserInfo(userInfo);
			
		} else if (UserInfoClient2.dbName.equals("MSSQL")) {
			dao = new UserInfoMssqlDao();
			dao.insertUserInfo(userInfo);
			dao.updateUserInfo(userInfo);
			
		}
		
		
		
		
	}
	
	
}
