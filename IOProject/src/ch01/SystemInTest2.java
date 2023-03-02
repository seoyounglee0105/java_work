package ch01;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// 기반 스트림
		
		System.out.println("알파벳 여러 개를 쓰고 엔터를 눌러 주세요.");
		
		int i;
		
		try {
			
//			i = System.in.read(); // 한 번 수행되는 코드임 -> 엔터 키를 누를 때까지 반복시키고 싶다면? (엔터 키 = \n)
			
			// 괄호 안에는 식을 작성할 수 있음
			
			// 1byte라서 "\n" 대신 char를 받는 '\n'로 해야 작동함
			// i에 저장된 값이 \n이 아닐 경우 계속 반복함
			while ( ( i = System.in.read() ) != '\n' ) {
				// 화면에 출력
				System.out.println("i : " + i);
				System.out.println("문자 값으로 인코딩 : " + (char) i);
			}

			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
