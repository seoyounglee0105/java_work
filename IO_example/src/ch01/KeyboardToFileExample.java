package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class KeyboardToFileExample {

	public static void main(String[] args) {

//		try {
//			 입력 스트림 준비
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			 출력 스트림 준비
//			BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// 오토 클로즈 : 자동으로 리소스를 닫아줌
		// 불필요하게 close()를 계속 작성해줄 필요가 없음
		// 식은 괄호 () 안에 작성
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));

		) {
			// 중괄호 안에는 수행시킬 코드 작성
			System.out.println("키보드로 입력받아 데이터를 파일에다가 작성하기");
			
			String input = reader.readLine();
			
			// 사용자가 quit를 입력하면 종료 
			while ( !input.equals("나갈래") ) {
				// 파일에 글 작성
				writer.write(input);
				writer.newLine();
				// 키보드에서 데이터를 다시 입력받기
				input = reader.readLine();
			}
			// 나갈래를 입력하면 while문이 종료됨
			System.out.println("출력이 완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
