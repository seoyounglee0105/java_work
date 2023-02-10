package ch08;

public class EmployMainTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setName("홍길동");

		Employee employee3 = new Employee();
		employee3.setName("티모");
		
		// static 변수만 사용을 하면 각각의 객체가 고유한 상태 값을 가지도록 할 수 없다.
		// (static 변수의 값은 각 인스턴스들이 공유하는 값이기 때문에)
		// 따라서, 멤버 변수를 활용해서 사용해야 한다.
		System.out.println(Employee.serialNum);

		// 홍길동의 사원번호
		System.out.println(employee2.getEmployeeId());
		// 티모의 사원번호
		System.out.println(employee3.getEmployeeId());
		
	}

}
