package ch03;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 객체지향 프로그래밍의 기본 원리
		// 코드를 재활용해서 클래스화시켜서 목적을 잘 정리해두면 가져와서 쓰기만 하면 됨.
		

		// DB에 접근해서 기능을 수행
		EmployeeDAO employeeDAO = new EmployeeDAO(); // 생성자에 지정해놔서 DBClient 객체도 같이 생성됨
		// select 결과를 list로 반환받음
		ArrayList<EmployeeDTO> list = employeeDAO.select(10005);
		
		System.out.println("여기는 main");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
