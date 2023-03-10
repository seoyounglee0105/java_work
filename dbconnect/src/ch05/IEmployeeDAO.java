package ch05;

import java.util.ArrayList;

public interface IEmployeeDAO {

	// WHERE 조건절에 직함(title)을 입력받아서 해당하는 직원들의 이력을 출력하는 기능
	ArrayList<EmployeeDTO> showTitleEmpInfo(String title); // 다중 행 결과 집합
	
	// 풀 네임을 입력받아서, 해당 직원이 연봉을 받은 횟수를 반환하는 기능
	int showSalaryCount(String firstName, String lastName);
	
}
