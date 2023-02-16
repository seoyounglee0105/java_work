package ch05Ex;

// 윤년 계산 기능 구현
public class LeapYear {

	// 이해해두기 ~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// 메서드의 반환 자료형에 제네릭을 넣으면, 
	// 하나의 메서드만 만들어도 상황에 따라 다른 자료형을 리턴할 수 있음
//	public Box<T> getData(){
//		return null;
//	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	// 문제 : 윤년 계산하기
	
	// 4의 배수인 해는 윤년임
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// => 4의 배수이면서 100의 배수가 아니어야 윤년임
	
	// 100의 배수이면서 400의 배수인 해는 윤년임
	
	// 매개변수에 연도를 넣으면 윤년인지 아닌지 판별하는 메서드를 만들어보세요.
	// 시간 남으면 Swing으로 연도 입력하면 리턴하는거 만들어보세요.
	
	
	// 논리 연산자를 사용한 메서드
	public boolean isLeapYear(int year) {
		boolean result = false; 
		if (year % 100 == 0 && year % 400 == 0) {
			result =  true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			result = true;
		}
		System.out.println(year + "년은 윤년인가? : " + result);
		return result;
	} // end of method
	
	
	// 논리 연산자를 사용하지 않은 메서드
	public boolean isLeapYear2(int year) {
		boolean result = false;
		if (year % 4 == 0) {
			if (year % 100 != 0) { 
				result = true;
				// year % 4 == 0이고 year % 100 == 0인 값은 else로 빠짐
			} else {
				if (year % 400 == 0) {
					result = true;
				} else {
					result = false;
				}
			}
		} // end of if
		System.out.println(year + "년은 윤년인가? : " + result);
		return result;
	} // end of method
	
	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		int x = 2000;
		leapYear.isLeapYear(x);
		leapYear.isLeapYear2(x);
	} // end of main
	
} // end of class
