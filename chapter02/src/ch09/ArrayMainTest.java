package ch09;

public class ArrayMainTest {

	public static void main(String[] args) {
		// 배열 ****
		// *연관된 데이터*를 모아서 *통으로* 관리하기 위해서 사용하는 데이터 타입
        // 변수가 하나의 데이터를 저장하기 위한 것이라면,
		// 배열은 여러 개의 데이터를 하나의 변수에 저장하기 위한 것.
		
		// 배열을 선언할 때 몇 칸의 공간을 사용할지 먼저 지정해주어야 함 ***
		// 배열 선언 방법 : 자료형[] 배열명 = new 자료형[공간크기];
		int[] arr = new int[5]; // [] : 인덱스 연산자, 이거는 메모리 영역에 공간만 할당한거 (값 아직 안넣음)
		// int와 int[]는 다른 타입이다. (자료형 입력 시 유의)
		
		// 값을 넣는 방법(인덱스 연산 값 할당) : 배열명[인덱스] = 값;
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;
		
		// 값을 확인하는 방법
		System.out.println(arr[2]);
		
		
		// 연습하기
		
		// String을 담을 배열 선언
		String[] arrStr = new String[3];
		arrStr[2] = "A";
		System.out.println(arrStr[2]);
		
		// double을 담을 배열 선언
		double[] arrDoub = new double[2]; 
		arrDoub[1] = 0.3;
		System.out.println(arrDoub[1]);
		
	}

}
