package ch06;

public class MainTest1 {

	// 1. 리턴 값이 int, 매개변수 n1, n2, n3, 이름은 intAdd인 함수
	
	static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	
	// 2. 리턴 값이 double, 매개변수 n1, n2, 이름은 doubleAdd인 함수
	
	static double doubleAdd(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}
	
	// 3. 리턴 값이 void, 매개변수 String article, 이름은 printArticle, 문자열 출력 함수
	
	static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	// 테스트 - 실행코드 main
	public static void main(String[] args) {
		
		System.out.println(intAdd(1, 2, 3));
		System.out.println(doubleAdd(1.0, 2.0));
		printArticle("안녕하세요");
		
	}
	
}
