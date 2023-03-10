package ch05;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();
		ArrayList<EmployeeDTO> tempList = new ArrayList<>();
		
		// showTitleEmpInfo test
//		tempList = employeeDAO.showTitleEmpInfo("Staff");
//		
//		for (int i = 0; i < tempList.size(); i++) {
//			// 필요한 정보만 가져오기
//			String empNo = tempList.get(i).getEmpNo();
//			String firstName = tempList.get(i).getFirstName();
//			String title = tempList.get(i).getTitle();
//			
//			System.out.println("empNo : " + empNo);
//			System.out.println("firstName : " + firstName);
//			System.out.println("title : " + title);
//		}
		// end of showTitleEmpInfo test
		
		// 
		String targetFirstName = "Georgi";
		String targetLastName = "Facello";
		
		int result = employeeDAO.showSalaryCount(targetFirstName, targetLastName);
		
		System.out.println(targetFirstName + " " + targetLastName + "가 연봉을 받은 횟수는 " + result + "회입니다.");
		
		
	} // end of main
}
