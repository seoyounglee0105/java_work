package ch03;

// 정보 추가/수정/삭제/조회 기능을 인터페이스로
public class EmployeeDTO {

	int empNo;
	String birthDate;
	String firstName;
	String lastName;
	String gender;
	String hireDate;
	
	public EmployeeDTO(int empNo, String birthDate, String firstName, String lastName, String gender, String hireDate) {
		this.empNo = empNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}
	
	
	
}
