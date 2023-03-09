package ex04;

import java.util.ArrayList;

// Data Access Object
public interface IUserDAO {

	ArrayList<UserDTO> select();  // 전체 조회 기능 (SELECT * ~)
	
	// 결과 적용 행을 반환하려면 int, 필요 없으면 void
	int insert(UserDTO dto); 
	
	// 매개변수 : dto, WHERE 절에 들어갈 조건 컬럼의 값 (대부분 중복 값을 갖지 않는 기본키를 이용함)
	int update(UserDTO dto, String targetUserName);
	
	// WHERE 절의 조건 컬럼 값만 있으면 돼서 DTO는 안받음
	boolean delete(String targetUserName);
	
}
