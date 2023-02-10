package ch08;

public class CompanyMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Company company = new (Company); // 사용불가
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		System.out.println(company3);
	}

}
