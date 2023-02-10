package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		// 관계 연산자
		// 관찰의 결과를 참, 거짓으로 판별할 때 사용함
		// true, false 결과만 반환됨
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println(5 > 3);
		boolean value1 = 5 > 3;
		
		boolean value2 = 5 < 3;
		System.out.println(value2);
		
		boolean value3 = num1 == num2;
		System.out.println(value3);
		
		boolean value4 = num1 != num2; 
		System.out.println(value4);

	}

}
