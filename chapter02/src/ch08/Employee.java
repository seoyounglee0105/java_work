package ch08;

/*
 * static 변수와 멤버 변수에 활용
 */

public class Employee {
	
	public static int serialNum;
	private int employeeId;
	private String name;
	private String department;
	
	// 생성자를 호출한다는 것은?
	public Employee() {
		serialNum++;
		this.employeeId = serialNum;
	}

	// get(), set() 단축키 : [Shift] + [Alt] + [S] -> [Generate Getters and Setters]
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}


	

	
	
}
