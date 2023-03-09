package ex04;

import java.util.ArrayList;

public class MainTest1_user {

	public static void main(String[] args) {
		// DB에 접근해서 userTBL에 대한 정보 얻기
		
		UserDAO userDAO = new UserDAO();
		
		// insert
//		int rowCount = userDAO.insert(new UserDTO("아이즈원", "2020", "경기도", "010-3333-4444"));
//		System.out.println("rowCount : " + rowCount);
	
		// update
//		UserDTO dto = new UserDTO("야스오", "1997", "서울", "010-2422-3333");
//		int updateRowCount = userDAO.update(dto, dto.getUserName());
//		System.out.println("rowCount : " + updateRowCount);
	
		// delete
		boolean isDelete = userDAO.delete("이승기");
		System.out.println("삭제 여부 : " + isDelete);
		
		if (isDelete == false) {
			System.out.println("구매 테이블에 이력이 남아 있을 수 있습니다.");
		}
		
		// select
//		ArrayList<UserDTO> list = userDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUserName());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-----------------");
//		}
		
		
		
		
		
	}
	
}
