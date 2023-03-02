package ch01;

import java.io.IOException;

public class SystemInTest1 {

	
	public static void main(String[] args) {
		
		// 키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳을 하나 쓰고 엔터를 누르세요.");
		
		int i;
		
		// Scanner는 사용자를 돕기 위한 클래스
		
		// 원 형식
		// 바이트 스트림
		// 한 바이트씩 키보드의 값을 입력받아 읽어라.
		// 기반 스트림
		try {
			// 입력
			i = System.in.read();
			
			// 출력
			System.out.println(i); // 정수 값 출력
			System.out.println((char) i); // 문자 출력 -> 한글은 깨져서 나타남
			
			// 컴퓨터에는 미리 약속된 문자표가 있음
			// 인코딩 : 정수 값을 문자열로 변환하는 것
			// 디코딩 : 문자열을 정수 값으로 변환하는 것
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end of main
} // end of class
