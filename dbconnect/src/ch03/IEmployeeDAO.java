package ch03;

import java.util.ArrayList;

// 인터페이스의 첫 글자 I를 붙여줌
public interface IEmployeeDAO {

	// CRUD 구조로 
	
	// 모두 추상 메서드
	void insert(EmployeeDTO dto); // 각각 입력해줘도 되지만, 클래스로 묶어서 바라보는 게 더 간단함
	
	ArrayList<EmployeeDTO> select(int empNo); // 조회 조건을 지정해야 함
	ArrayList<EmployeeDTO> select(String lastName); // 메서드 오버로딩으로 여러 타입의 조회 조건을 받을 수 있게
	
	void update(String gender);
	
	void delete(int empNo); // 삭제 조건을 지정해야 함
	void delete(String lastName); // 메서드 오버로딩으로 여러 타입의 삭제 조건을 받을 수 있게
	
}
