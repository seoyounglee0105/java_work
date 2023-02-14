package ch05;

public class UserInfoMysqlDao implements IUserInfoDao{
	
	// DB 연결은 코드 작성 (이름, PW)
	// 질의성 생성
	// 결과 집합

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 저장 기능 호출");
		
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL : 수정 기능 호출");
		
		System.out.println("이름 : " + userInfo.getUserName());
		System.out.println("비밀번호 : " + userInfo.getPw());
	}

	@Override
	public void deleteUserInfo(String userName) {
		System.out.println("MYSQL : 삭제 기능 호출");
		
		System.out.println("이름 : " + userName);
	}

	@Override
	public void selectUserInfo(String userName) {
		System.out.println("MYSQL : 조회 기능 호출");
		
		System.out.println("이름 : " + userName);
	}
	
	

}
